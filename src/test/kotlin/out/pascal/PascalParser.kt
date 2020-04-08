class PascalParser(private val tokens: List<PascalToken>) {
    private var position = 0

    private fun skipToken() = position++
    private fun currentToken() = tokens[position]

    private fun expectedToken(expectedToken: PascalTokenType) {
        if (currentToken().type != expectedToken) {
            throw Exception("\nexpected: `${expectedToken}`\nactual: `${currentToken().type}`")
        }
    }

    fun parse__FP_DECLARATION(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_FUNCTION -> {

                val FUNCTION: Node = parse__FUNCTION()

                val FP_DECLARATION: Node = parse__FP_DECLARATION()
                Node("NODE_FP_DECLARATION", listOf(FUNCTION, FP_DECLARATION))
            }
            PascalTokenType.KEYWORD_PROCEDURE -> {

                val PROCEDURE: Node = parse__PROCEDURE()

                val FP_DECLARATION: Node = parse__FP_DECLARATION()
                Node("NODE_FP_DECLARATION", listOf(PROCEDURE, FP_DECLARATION))
            }
            PascalTokenType.EOF -> {
                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__FUNCTION(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_FUNCTION -> {
                var KEYWORD_FUNCTION_text: string = string()

                val KEYWORD_FUNCTION: Node = parse_token__KEYWORD_FUNCTION(KEYWORD_FUNCTION_text)

                val SIGNATURE: Node = parse__SIGNATURE()
                var COLON_text: string = string()

                val COLON: Node = parse_token__COLON(COLON_text)
                var WORD_text: string = string()

                val WORD: Node = parse_token__WORD(WORD_text)
                var SEMICOLON_text: string = string()

                val SEMICOLON: Node = parse_token__SEMICOLON(SEMICOLON_text)
                Node("NODE_FUNCTION", listOf(KEYWORD_FUNCTION, SIGNATURE, COLON, WORD, SEMICOLON))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__PROCEDURE(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_PROCEDURE -> {
                var KEYWORD_PROCEDURE_text: string = string()

                val KEYWORD_PROCEDURE: Node = parse_token__KEYWORD_PROCEDURE(KEYWORD_PROCEDURE_text)

                val SIGNATURE: Node = parse__SIGNATURE()
                var SEMICOLON_text: string = string()

                val SEMICOLON: Node = parse_token__SEMICOLON(SEMICOLON_text)
                Node("NODE_PROCEDURE", listOf(KEYWORD_PROCEDURE, SIGNATURE, SEMICOLON))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__SIGNATURE(): Node {
        return when (currentToken().type) {
            PascalTokenType.WORD -> {
                var WORD_text: string = string()

                val WORD: Node = parse_token__WORD(WORD_text)
                var OPEN_BRACKET_text: string = string()

                val OPEN_BRACKET: Node = parse_token__OPEN_BRACKET(OPEN_BRACKET_text)

                val DECLARATIONS: Node = parse__DECLARATIONS()
                var CLOSE_BRACKET_text: string = string()

                val CLOSE_BRACKET: Node = parse_token__CLOSE_BRACKET(CLOSE_BRACKET_text)
                Node("NODE_SIGNATURE", listOf(WORD, OPEN_BRACKET, DECLARATIONS, CLOSE_BRACKET))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__DECLARATIONS(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_VAR -> {

                val DECLARATION: Node = parse__DECLARATION()

                val DECLARATIONS_SUFFIX: Node = parse__DECLARATIONS_SUFFIX()
                Node("NODE_DECLARATIONS", listOf(DECLARATION, DECLARATIONS_SUFFIX))
            }
            PascalTokenType.WORD -> {

                val DECLARATION: Node = parse__DECLARATION()

                val DECLARATIONS_SUFFIX: Node = parse__DECLARATIONS_SUFFIX()
                Node("NODE_DECLARATIONS", listOf(DECLARATION, DECLARATIONS_SUFFIX))
            }
            PascalTokenType.CLOSE_BRACKET -> {
                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__DECLARATION(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_VAR -> {

                val VAR_DECLARATION: Node = parse__VAR_DECLARATION()
                Node("NODE_DECLARATION", listOf(VAR_DECLARATION))
            }
            PascalTokenType.WORD -> {

                val SIMPLE_DECLARATION: Node = parse__SIMPLE_DECLARATION()
                Node("NODE_DECLARATION", listOf(SIMPLE_DECLARATION))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__VAR_DECLARATION(): Node {
        return when (currentToken().type) {
            PascalTokenType.KEYWORD_VAR -> {
                var KEYWORD_VAR_text: string = string()

                val KEYWORD_VAR: Node = parse_token__KEYWORD_VAR(KEYWORD_VAR_text)

                val SIMPLE_DECLARATION: Node = parse__SIMPLE_DECLARATION()
                Node("NODE_VAR_DECLARATION", listOf(KEYWORD_VAR, SIMPLE_DECLARATION))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__SIMPLE_DECLARATION(): Node {
        return when (currentToken().type) {
            PascalTokenType.WORD -> {

                val NAMES: Node = parse__NAMES()
                var COLON_text: string = string()

                val COLON: Node = parse_token__COLON(COLON_text)
                var WORD_text: string = string()

                val WORD: Node = parse_token__WORD(WORD_text)
                Node("NODE_SIMPLE_DECLARATION", listOf(NAMES, COLON, WORD))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__NAMES(): Node {
        return when (currentToken().type) {
            PascalTokenType.WORD -> {
                var WORD_text: string = string()

                val WORD: Node = parse_token__WORD(WORD_text)

                val NAMES_SUFFIX: Node = parse__NAMES_SUFFIX()
                Node("NODE_NAMES", listOf(WORD, NAMES_SUFFIX))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__NAMES_SUFFIX(): Node {
        return when (currentToken().type) {
            PascalTokenType.COMMA -> {
                var COMMA_text: string = string()

                val COMMA: Node = parse_token__COMMA(COMMA_text)

                val NAMES: Node = parse__NAMES()
                Node("NODE_NAMES_SUFFIX", listOf(COMMA, NAMES))
            }
            PascalTokenType.COLON -> {
                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__DECLARATIONS_SUFFIX(): Node {
        return when (currentToken().type) {
            PascalTokenType.SEMICOLON -> {
                var SEMICOLON_text: string = string()

                val SEMICOLON: Node = parse_token__SEMICOLON(SEMICOLON_text)

                val DECLARATIONS: Node = parse__DECLARATIONS()
                Node("NODE_DECLARATIONS_SUFFIX", listOf(SEMICOLON, DECLARATIONS))
            }
            PascalTokenType.CLOSE_BRACKET -> {
                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse_token__KEYWORD_VAR(text: string): Node {
        expectedToken(PascalTokenType.KEYWORD_VAR)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_KEYWORD_VAR", listOf(Node(text.value)))
    }

    fun parse_token__KEYWORD_FUNCTION(text: string): Node {
        expectedToken(PascalTokenType.KEYWORD_FUNCTION)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_KEYWORD_FUNCTION", listOf(Node(text.value)))
    }

    fun parse_token__KEYWORD_PROCEDURE(text: string): Node {
        expectedToken(PascalTokenType.KEYWORD_PROCEDURE)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_KEYWORD_PROCEDURE", listOf(Node(text.value)))
    }

    fun parse_token__COLON(text: string): Node {
        expectedToken(PascalTokenType.COLON)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_COLON", listOf(Node(text.value)))
    }

    fun parse_token__SEMICOLON(text: string): Node {
        expectedToken(PascalTokenType.SEMICOLON)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_SEMICOLON", listOf(Node(text.value)))
    }

    fun parse_token__COMMA(text: string): Node {
        expectedToken(PascalTokenType.COMMA)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_COMMA", listOf(Node(text.value)))
    }

    fun parse_token__OPEN_BRACKET(text: string): Node {
        expectedToken(PascalTokenType.OPEN_BRACKET)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_OPEN_BRACKET", listOf(Node(text.value)))
    }

    fun parse_token__CLOSE_BRACKET(text: string): Node {
        expectedToken(PascalTokenType.CLOSE_BRACKET)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_CLOSE_BRACKET", listOf(Node(text.value)))
    }

    fun parse_token__WORD(text: string): Node {
        expectedToken(PascalTokenType.WORD)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_WORD", listOf(Node(text.value)))
    }

}
