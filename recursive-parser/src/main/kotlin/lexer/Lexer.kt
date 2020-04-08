package lexer

import Token
import TokenType
import lexer.exceptions.InvalidNameException

class Lexer {
    fun getTokens(string: String): List<Token> {
        val len = string.length
        var position = 0

        fun Char.isLatinLetter(): Boolean {
            return this in 'a'..'z' || this in 'A'..'Z'
        }

        @Throws(InvalidNameException::class)
        fun getNextToken(): Token? {
            while (position < len && string[position].isWhitespace()) {
                ++position
            }

            if (position == len) {
                return null
            }

            return when (val c = string[position]) {
                '(' -> Token(TokenType.OPEN_BRACKET).also { position++ }
                ')' -> Token(TokenType.CLOSE_BRACKET).also { position++ }
                ',' -> Token(TokenType.COMMA).also { position++ }
                ':' -> Token(TokenType.COLON).also { position++ }
                ';' -> Token(TokenType.SEMICOLON).also { position++ }
                else -> {
                    if (c.isLatinLetter()) {
                        val positionFrom = position
                        while (position < len && (string[position].isLatinLetter() || string[position].isDigit())) {
                            ++position;
                        }
                        val positionTo = position
                        val tokenData: String? = string.substring(positionFrom, positionTo)
                        val tokenType: TokenType = when (tokenData) {
                            "function" -> TokenType.FUNCTION
                            "procedure" -> TokenType.PROCEDURE
                            "var" -> TokenType.VAR
                            else -> TokenType.WORD
                        }
                        Token(tokenType, tokenData)
                    } else {
                        throw InvalidNameException("\nexpected: latin letter in begin of word\nactual:`${c}`")
                    }
                }
            }
        }

        val tokens = mutableListOf<Token>()
        var token: Token? = getNextToken()

        while (token != null) {
            tokens += token
            token = getNextToken()
        }
        return tokens + Token(TokenType.EOF)
    }
}
