import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Test
import java.io.BufferedReader
import java.io.FileReader

class Tester {
    @Test
    fun test() {
        val test = StringBuilder()
        var line: String?
        val correct = BufferedReader(FileReader("src/test/test"))
        while (correct.readLine().also { line = it } != null) {
            test.append(line).append("\n")
        }
        val lexer = GrammarLexer(CharStreams.fromString(test.toString()))
        val tokens = CommonTokenStream(lexer)
        val parser = GrammarParser(tokens)
        parser.start().results.forEach{ println(it) }
    }
}