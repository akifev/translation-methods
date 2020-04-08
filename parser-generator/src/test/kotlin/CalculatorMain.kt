private fun List<CalculatorToken>.visualize(): String {
    val result = StringBuilder()
    for (t in this) {
        result.append(t.type)
        if (t.data != null) {
            result.append("(${t.data}) ")
        }
    }
    return result.toString()
}

fun main() {
    println("TOKENS:")

    val lexer = CalculatorLexer()

    val tokens = lexer.getTokens("2+2*3!")
    print(tokens.visualize())

    val parser = CalculatorParser(tokens)

    println()
    println("ANSWER:")
    val visualizer = Visualizer(parser.parse__s())
    print(visualizer.visualize())

    println()
}