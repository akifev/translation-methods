import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    createParser("pascal")
    createParser("calculator")
}

private fun createParser(name: String) {
    val source = readFile(name)

    val lexer = GrammarLexer(CharStreams.fromString(source))
    val tokens = CommonTokenStream(lexer)
    val parser = GrammarParser(tokens)

    val grammar = parser.s().g

    val parserGenerator = ParserGenerator(grammar, "src\\test\\kotlin\\out\\${name}")

    parserGenerator.generateParser()

    println("OK: ${name}")
}

private fun readFile(name: String): String {
    val path = Paths.get("src\\test\\$name")

    val result = StringBuilder()
    Files.readAllLines(path).forEach { result.append(it).append(System.lineSeparator()) }

    return result.toString()
}