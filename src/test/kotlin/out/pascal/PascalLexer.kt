class PascalLexer {
    fun getTokens(str: String): List<PascalToken> {
        val len: Int = str.length
        var position: Int = 0
        var data: String? = null

        fun find(value: String): Boolean {
            val regex = value.toRegex()
            val match = regex.find(str, position)

            data = match?.value

            return match != null && match.range.first == position
        }

        fun getNextToken(): PascalToken? {
            while (position < len && str[position].isWhitespace()) {
                position++
            }

            if (position == len) {
                return null
            }

            return when {
                find("\\bvar\\b") -> PascalToken(PascalTokenType.KEYWORD_VAR, data).also { position += data!!.length }
                find("\\bfunction\\b") -> PascalToken(
                    PascalTokenType.KEYWORD_FUNCTION,
                    data
                ).also { position += data!!.length }
                find("\\bprocedure\\b") -> PascalToken(
                    PascalTokenType.KEYWORD_PROCEDURE,
                    data
                ).also { position += data!!.length }
                find("\\:") -> PascalToken(PascalTokenType.COLON, data).also { position += data!!.length }
                find("\\;") -> PascalToken(PascalTokenType.SEMICOLON, data).also { position += data!!.length }
                find("\\,") -> PascalToken(PascalTokenType.COMMA, data).also { position += data!!.length }
                find("\\(") -> PascalToken(PascalTokenType.OPEN_BRACKET, data).also { position += data!!.length }
                find("\\)") -> PascalToken(PascalTokenType.CLOSE_BRACKET, data).also { position += data!!.length }
                find("[a-zA-Z][a-zA-Z0-9]*") -> PascalToken(
                    PascalTokenType.WORD,
                    data
                ).also { position += data!!.length }
                else -> throw Exception("Unexpected token at position $position")
            }
        }

        val tokens = mutableListOf<PascalToken>()
        var token: PascalToken? = getNextToken()

        while (token != null) {
            tokens += token
            token = getNextToken()
        }

        return tokens + PascalToken(PascalTokenType.EOF)
    }
}
