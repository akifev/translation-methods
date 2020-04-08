package parser

import Token
import TokenType
import parser.exceptions.ParseException

data class Node(val name: String, val children: List<Node> = emptyList())

class Parser(private val tokens: List<Token>) {
    private var position = 0
    private var pascalTypes = setOf("integer", "string", "char", "boolean", "real")
    private fun String?.isType(): Boolean {
        return pascalTypes.contains(this)
    }

    fun parseFPDeclarations(): Node {
        return when (currentToken().type) {
            TokenType.EOF -> Node("NO FP-DECLARATION")
            TokenType.FUNCTION -> Node("FP-DECLARATION", listOf(parseFunction(), parseFPDeclarations()))
            TokenType.PROCEDURE -> Node("FP-DECLARATION", listOf(parseProcedure(), parseFPDeclarations()))
            else -> throw ParseException("\nexpected: `function` or `procedure` or `EOF`\nactual: `${currentToken().type}`")
        }
    }

    private fun parseProcedure(): Node {
        skipToken() // skips keyword "procedure"

        val signature = parseSignature()

        expectedToken(TokenType.SEMICOLON)
        skipToken()

        return Node("PROCEDURE", listOf(signature))
    }

    private fun parseFunction(): Node {
        skipToken() // skips keyword "function"

        val signature = parseSignature()

        expectedToken(TokenType.COLON)
        skipToken()

        val returnType = parseWord()

        expectedToken(TokenType.SEMICOLON)
        skipToken()

        return Node("FUNCTION", listOf(signature, returnType))
    }

    private fun parseWord(): Node {
        expectedToken(TokenType.WORD)
        val word: String = currentToken().data!!
        skipToken()

        return Node(word)
    }

    private fun parseSignature(): Node {
        val name = parseWord()

        expectedToken(TokenType.OPEN_BRACKET)
        skipToken()

        val arguments = parseDeclarations()

        expectedToken(TokenType.CLOSE_BRACKET)
        skipToken()

        return Node("SIGNATURE", listOf(name, arguments))
    }

    private fun parseDeclarations(): Node {
        return when (currentToken().type) {
            TokenType.CLOSE_BRACKET -> Node("NO DECLARATIONS")
            TokenType.WORD -> Node("DECLARATIONS", listOf(parseDeclaration(), parseDeclarationsSuffix()))
            TokenType.VAR -> Node("DECLARATIONS", listOf(parseDeclaration(), parseDeclarationsSuffix()))
            else -> throw ParseException("\nexpected `)` or argument name\nactual: `${currentToken().type}`")
        }
    }

    private fun parseDeclarationsSuffix(): Node {
        return when (currentToken().type) {
            TokenType.CLOSE_BRACKET -> Node("EMPTY DECLARATIONS SUFFIX")
            TokenType.SEMICOLON -> {
                skipToken() // skips semicolon

                parseDeclarations()
            }
            else -> throw ParseException("\nexpected: `)` or `;` and other declaration\nactual: `${currentToken().type}`")
        }
    }

    private fun parseDeclaration(): Node {
        return when (currentToken().type) {
            TokenType.VAR -> parseVarDeclaration()
            TokenType.WORD -> parseSimpleDeclaration()
            else -> throw ParseException("\nexpected: parameter name or keyword `var`\nactual: `${currentToken().type}`")
        }
    }

    private fun parseVarDeclaration(): Node {
        expectedToken(TokenType.VAR);
        skipToken()

        return Node("VAR-DECLARATION", listOf(parseSimpleDeclaration()))
    }

    private fun parseSimpleDeclaration(): Node {
        expectedToken(TokenType.WORD);

        val names = parseNames()

        expectedToken(TokenType.COLON)
        skipToken()

        val declarationType = parseWord()

        return Node("DECLARATION", listOf(names, declarationType))
    }

    private fun parseNames(): Node {
        return Node("NAMES", listOf(parseWord(), parseNamesSuffix()))
    }

    private fun parseNamesSuffix(): Node {
        return when (currentToken().type) {
            TokenType.COLON -> Node("EMPTY NAMES SUFFIX")
            TokenType.COMMA -> {
                skipToken() // skips comma

                parseNames()
            }
            else -> throw ParseException("\nexpected: `:` or `,` and other parameter name\nactual: `${currentToken().type}`")
        }
    }

    private fun skipToken() = position++
    private fun currentToken() = tokens[position]

    private fun expectedToken(expectedToken: TokenType) {
        if (currentToken().type != expectedToken) {
            throw ParseException("\nexpected: `${expectedToken}`\nactual: `${currentToken().type}`")
        }
    }
}
