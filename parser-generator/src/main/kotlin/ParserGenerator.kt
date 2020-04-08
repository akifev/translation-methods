import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class ParserGenerator(
    val grammar: Grammar,
    var outputPath: String = "C:\\private\\translation-methods\\parser-generator\\src\\main\\kotlin\\out"
) {
    private val prefixName = grammar.name
    private val tokenClassName = "${prefixName}Token"
    private val tokenTypeClassName = "${prefixName}TokenType"
    private val lexerClassName = "${prefixName}Lexer"
    private val parserClassName = "${prefixName}Parser"

    fun generateParser() {
        grammar.FIRST = grammar.buildFirst()
        grammar.FOLLOW = grammar.buildFollow()

        createFiles()
        writeFiles()
    }

    private fun createFiles() {
        createFile("${tokenClassName}.kt")
        createFile("${tokenTypeClassName}.kt")
        createFile("${lexerClassName}.kt")
        createFile("${parserClassName}.kt")
    }

    private fun createFile(filename: String) {
        val file = File("${outputPath}\\${filename}")
        file.createNewFile()
    }

    private fun writeFiles() {
        writeTokenFile()
        writeTokenTypeFile()
        writeLexer()
        writeParser()
    }

    private fun writeTokenFile() {
        val sb: StringBuilder = StringBuilder()

        sb.appendln("class ${tokenClassName}(val type: ${tokenTypeClassName}? = null, val data: String? = null)")

        writeFile(tokenClassName, sb.toString())
    }

    private fun writeTokenTypeFile() {
        val sb: StringBuilder = StringBuilder()

        sb.appendln("enum class ${tokenTypeClassName} {")

        grammar.tokens.forEach { sb.append(it.name + ", ") }
        sb.appendln("EOF")

        sb.appendln("}")

        writeFile(tokenTypeClassName, sb.toString())
    }

    private fun writeLexer() {
        val sb: StringBuilder = StringBuilder()

        sb.appendln("class ${lexerClassName} {")
        sb.appendln("fun getTokens(str: String): List<${tokenClassName}> {")

        sb.appendln("val len: Int = str.length")
        sb.appendln("var position: Int = 0")
        sb.appendln("var data: String? = null")
        sb.appendln("")
        sb.appendln("fun find(value: String): Boolean {")
        sb.appendln("val regex = value.toRegex()")
        sb.appendln("val match = regex.find(str, position)")
        sb.appendln("")
        sb.appendln("data = match?.value")
        sb.appendln("")
        sb.appendln("return match != null && match.range.first == position")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("fun getNextToken(): ${tokenClassName}? {")
        sb.appendln("while (position < len && str[position].isWhitespace()) {")
        sb.appendln("position++")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("if (position == len) {")
        sb.appendln("return null")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("return when {")

        grammar.tokens.forEach {
            sb.appendln("find(\"${it.regex}\") -> ${tokenClassName}(${tokenTypeClassName}.${it.name}, data).also{ position += data!!.length }")
        }

        sb.appendln("else -> throw Exception(\"Unexpected token at position ${'$'}position\")")

        sb.appendln("}")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("val tokens = mutableListOf<${tokenClassName}>()")
        sb.appendln("var token: ${tokenClassName}? = getNextToken()")
        sb.appendln("")
        sb.appendln("while (token != null) {")
        sb.appendln("tokens += token")
        sb.appendln("token = getNextToken()")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("return tokens + ${tokenClassName}($tokenTypeClassName.EOF)")
        sb.appendln("}")
        sb.appendln("}")

        writeFile(lexerClassName, sb.toString())
    }

    private fun writeParser() {
        val sb: StringBuilder = StringBuilder()

        if (grammar.header != null) {
            sb.appendln(grammar.header)
            sb.appendln("")
        }

        // write_int(sb)

        // write_string(sb)

        // write_Node(sb)

        sb.appendln("class ${parserClassName}(private val tokens: List<${tokenClassName}>) {")

        if (grammar.members != null) {
            sb.appendln(grammar.members)
            sb.appendln("")
        }

        sb.appendln("private var position = 0")
        sb.appendln("")
        sb.appendln("private fun skipToken() = position++")
        sb.appendln("private fun currentToken() = tokens[position]")
        sb.appendln("")
        sb.appendln("private fun expectedToken(expectedToken: ${tokenTypeClassName}) {")
        sb.appendln("if (currentToken().type != expectedToken) {")
        sb.appendln("throw Exception(\"\\nexpected: `${'$'}${'{'}expectedToken${'}'}`\\nactual: `${'$'}${'{'}currentToken().type${'}'}`\")")
        sb.appendln("}")
        sb.appendln("}")
        sb.appendln("")

        grammar.states.forEach { state ->
            processState(sb, state)
        }

        grammar.tokens.forEach { token ->
            processToken(sb, token)
        }
        sb.appendln("}")

        writeFile(parserClassName, sb.toString())
    }

    private fun write_Node(sb: StringBuilder) {
        sb.appendln("class Node(val name: String, val children: List<Node> = emptyList())")
        sb.appendln("")
    }

    private fun write_string(sb: StringBuilder) {
        sb.appendln("class string(var value: String = \"\")")
        sb.appendln("")
    }

    private fun write_int(sb: StringBuilder) {
        sb.appendln("class int(var value: Int = 0) {")
        sb.appendln("operator fun plus(arg: int): int {")
        sb.appendln("return int(this.value + arg.value)")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("operator fun minus(arg: int): int {")
        sb.appendln("return int(this.value - arg.value)")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("operator fun times(arg: int): int {")
        sb.appendln("return int(this.value * arg.value)")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("operator fun div(arg: int): int {")
        sb.appendln("return int(this.value / arg.value)")
        sb.appendln("}")
        sb.appendln("")
        sb.appendln("operator fun unaryMinus(): int {")
        sb.appendln("return int(-this.value)")
        sb.appendln("}")
        sb.appendln("}")
        sb.appendln("")
    }

    private fun substituteLocals(sb: StringBuilder, state: State) {
        if (state.locals.isNotEmpty()) {
            state.locals.forEach { (type, name) ->
                sb.appendln("var ${name}: ${type} = ${type}()")
            }
            sb.appendln("")
        }
    }

    private fun substituteInit(sb: StringBuilder, state: State) {
        if (state.init != null) {
            sb.appendln(state.init)
            sb.appendln("")
        }
    }

    private fun substituteCode(sb: StringBuilder, item: Item) {
        if (item.code != null) {
            sb.appendln("")
            sb.appendln(item.code!!.replace('.', '_').replace("$", ".value"))
            sb.appendln("")
        }
    }

    private fun processToken(sb: StringBuilder, token: StateToken) {
        sb.appendln("fun parse_token__${token.name}(text: string): Node {")
        sb.appendln("expectedToken(${tokenTypeClassName}.${token.name})")
        sb.appendln("text.value = currentToken().data!!")
        sb.appendln("skipToken()")
        sb.appendln("return Node(\"NODE_${token.name}\", listOf(Node(text.value)))")
        sb.appendln("}")
        sb.appendln("")
    }

    private fun processState(sb: StringBuilder, state: State) {
        sb.append("fun parse__${state.name}(")
        state.parameters.forEach { (type, name) ->
            sb.append("${name}: ${type}, ")
        }
        state.returns.forEach { (type, name) ->
            sb.append("${name}: ${type}, ")
        }
        if (state.parameters.isNotEmpty() || state.returns.isNotEmpty()) {
            sb.deleteCharAt(sb.lastIndex)
            sb.deleteCharAt(sb.lastIndex)
        }
        sb.appendln("): Node {")

        substituteLocals(sb, state)

        substituteInit(sb, state)

        sb.appendln("return when (currentToken().type) {")

        require(state.rules.isNotEmpty())

        var hasEPSILON: Boolean = false
        var itemEPS: Item? = null

        state.rules.forEach { rule ->
            val (item: Item?, flag: Boolean) = processRule(sb, rule, state)
            if (flag) {
                if (itemEPS == null) {
                    itemEPS = item
                }
                hasEPSILON = true
            }
        }

        if (hasEPSILON) {
            val follow = grammar.FOLLOW[state.name]!!

            follow!!.forEach {
                sb.appendln("${tokenTypeClassName}.${it} -> {")
                if (itemEPS != null) {
                    substituteCode(sb, itemEPS!!)
                }
                sb.appendln("Node(\"EPS\")")
                sb.appendln("}")
                sb.appendln("")
            }
        }
        sb.appendln("else -> throw Exception(\"Unexpected token in a state\")")
        sb.appendln("}")
        sb.appendln("}")
        sb.appendln("")
    }

    private fun processRule(sb: StringBuilder, rule: Rule, state: State): Pair<Item?, Boolean> {
        require(rule.items.isNotEmpty())

        val firstItem: Item = rule.items[0]

        val maybeToken: StateToken? = grammar.tokens.find { it.name == firstItem.name }
        if (maybeToken != null) {
            val currentToken: StateToken = maybeToken

            sb.appendln("${tokenTypeClassName}.${currentToken.name} -> {")
            rule.items.forEach { item ->
                processItem(sb, item)
            }

            sb.append("Node(\"NODE_${state.name}\", listOf(")

            rule.items.forEach { item ->
                sb.append("${item.name}, ")
            }
            sb.deleteCharAt(sb.lastIndex)
            sb.deleteCharAt(sb.lastIndex)
            sb.append(")")
            sb.appendln(")")
            sb.appendln("}")

            return Pair(null, false)
        } else {
            if (firstItem.name == "EPS") {
                return Pair(firstItem, true)
            }

            val currentState: State =
                grammar.states.find { it.name == firstItem.name } ?: throw Exception("Incorrect name in a rule\n")

            require(currentState.rules.isNotEmpty())

            var first: MutableSet<String> = grammar.FIRST[firstItem.name]!!

            first.forEach {
                if (it != "EPS") {
                    sb.appendln("${tokenTypeClassName}.${it} -> {")
                    rule.items.forEach { item ->
                        processItem(sb, item)
                    }

                    sb.append("Node(\"NODE_${state.name}\", listOf(")

                    rule.items.forEach { item ->
                        sb.append("${item.name}, ")
                    }
                    sb.deleteCharAt(sb.lastIndex)
                    sb.deleteCharAt(sb.lastIndex)
                    sb.append(")")
                    sb.appendln(")")
                    sb.appendln("}")
                }
            }

            return Pair(null, first.contains("EPS"))
        }
    }

    private fun processItem(sb: StringBuilder, item: Item) {
        val maybeToken: StateToken? = grammar.tokens.find { it.name == item.name }
        if (maybeToken != null) {
            // item is a token
            val currentToken: StateToken = maybeToken

            sb.appendln("var ${currentToken.name}_text: string = string()")
            sb.appendln("")
            sb.appendln("val ${currentToken.name}: Node = parse_token__${currentToken.name}(${currentToken.name}_text)")

            substituteCode(sb, item)

        } else {
            // item is not a token
            val currentState: State =
                grammar.states.find { it.name == item.name } ?: throw Exception("Incorrect name in a rule\n")
            // item is a state

            currentState.returns.forEach { (type, name) ->
                sb.appendln("var ${currentState.name}_${name}: ${type} = ${type}()")
            }
            sb.appendln("")
            sb.append("val ${currentState.name}: Node = parse__${currentState.name}(")
            if (item.parameters != null) {
                sb.append("${item.parameters!!.replace('.', '_').replace("$", ".value")}, ")
            }
            currentState.returns.forEach { (_, name) ->
                sb.append("${currentState.name}_${name}, ")
            }
            if (item.parameters != null || currentState.returns.isNotEmpty()) {
                sb.deleteCharAt(sb.lastIndex)
                sb.deleteCharAt(sb.lastIndex)
            }
            sb.appendln(")")

            substituteCode(sb, item)
        }
    }

    private fun writeFile(filename: String, data: String) {
        val file = Paths.get("${outputPath}\\${filename}.kt")
        Files.write(file, data.toByteArray())
    }
}