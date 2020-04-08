private fun List<PascalToken>.visualize(): String {
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

    val lexer = PascalLexer()

    val tokens = lexer.getTokens("function fib(n: int): int;")
    print(tokens.visualize())

    val parser = PascalParser(tokens)

    println()
    println("ANSWER:")
    val visualizer = Visualizer(parser.parse__FP_DECLARATION())
    print(visualizer.visualize())

    println()
}