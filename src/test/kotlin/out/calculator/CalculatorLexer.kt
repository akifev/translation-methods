class CalculatorLexer {
    fun getTokens(str: String): List<CalculatorToken> {
        val len: Int = str.length
        var position: Int = 0
        var data: String? = null

        fun find(value: String): Boolean {
            val regex = value.toRegex()
            val match = regex.find(str, position)

            data = match?.value

            return match != null && match.range.first == position
        }

        fun getNextToken(): CalculatorToken? {
            while (position < len && str[position].isWhitespace()) {
                position++
            }

            if (position == len) {
                return null
            }

            return when {
                find("\\(") -> CalculatorToken(CalculatorTokenType.LPAREN, data).also { position += data!!.length }
                find("\\)") -> CalculatorToken(CalculatorTokenType.RPAREN, data).also { position += data!!.length }
                find("\\+") -> CalculatorToken(CalculatorTokenType.PLUS, data).also { position += data!!.length }
                find("\\-") -> CalculatorToken(CalculatorTokenType.MINUS, data).also { position += data!!.length }
                find("\\*") -> CalculatorToken(CalculatorTokenType.TIMES, data).also { position += data!!.length }
                find("\\/") -> CalculatorToken(CalculatorTokenType.DIV, data).also { position += data!!.length }
                find("\\!") -> CalculatorToken(CalculatorTokenType.FACTORIAL, data).also { position += data!!.length }
                find("[1-9][0-9]*") -> CalculatorToken(
                    CalculatorTokenType.NUMBER,
                    data
                ).also { position += data!!.length }
                else -> throw Exception("Unexpected token at position $position")
            }
        }

        val tokens = mutableListOf<CalculatorToken>()
        var token: CalculatorToken? = getNextToken()

        while (token != null) {
            tokens += token
            token = getNextToken()
        }

        return tokens + CalculatorToken(CalculatorTokenType.EOF)
    }
}
