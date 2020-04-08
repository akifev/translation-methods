import java.lang.Integer.parseInt


class CalculatorParser(private val tokens: List<CalculatorToken>) {

    private fun factorial(n: Int): Int {
        return when {
            n > 1 -> n * factorial(n - 1)
            else -> 1
        }
    }


    private var position = 0

    private fun skipToken() = position++
    private fun currentToken() = tokens[position]

    private fun expectedToken(expectedToken: CalculatorTokenType) {
        if (currentToken().type != expectedToken) {
            throw Exception("\nexpected: `${expectedToken}`\nactual: `${currentToken().type}`")
        }
    }

    fun parse__s(): Node {
        return when (currentToken().type) {
            CalculatorTokenType.MINUS -> {
                var expr_result: int = int()

                val expr: Node = parse__expr(expr_result)


                println(expr_result.value);


                Node("NODE_s", listOf(expr))
            }
            CalculatorTokenType.LPAREN -> {
                var expr_result: int = int()

                val expr: Node = parse__expr(expr_result)


                println(expr_result.value);


                Node("NODE_s", listOf(expr))
            }
            CalculatorTokenType.NUMBER -> {
                var expr_result: int = int()

                val expr: Node = parse__expr(expr_result)


                println(expr_result.value);


                Node("NODE_s", listOf(expr))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__expr(result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.MINUS -> {
                var term_result: int = int()

                val term: Node = parse__term(term_result)
                var exprP_result: int = int()

                val exprP: Node = parse__exprP(term_result, exprP_result)


                result.value = exprP_result.value;


                Node("NODE_expr", listOf(term, exprP))
            }
            CalculatorTokenType.LPAREN -> {
                var term_result: int = int()

                val term: Node = parse__term(term_result)
                var exprP_result: int = int()

                val exprP: Node = parse__exprP(term_result, exprP_result)


                result.value = exprP_result.value;


                Node("NODE_expr", listOf(term, exprP))
            }
            CalculatorTokenType.NUMBER -> {
                var term_result: int = int()

                val term: Node = parse__term(term_result)
                var exprP_result: int = int()

                val exprP: Node = parse__exprP(term_result, exprP_result)


                result.value = exprP_result.value;


                Node("NODE_expr", listOf(term, exprP))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__exprP(i: int, result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.PLUS -> {
                var PLUS_text: string = string()

                val PLUS: Node = parse_token__PLUS(PLUS_text)
                var term_result: int = int()

                val term: Node = parse__term(term_result)
                var exprP_result: int = int()

                val exprP: Node = parse__exprP(i + term_result, exprP_result)


                result.value = exprP_result.value;


                Node("NODE_exprP", listOf(PLUS, term, exprP))
            }
            CalculatorTokenType.MINUS -> {
                var MINUS_text: string = string()

                val MINUS: Node = parse_token__MINUS(MINUS_text)
                var term_result: int = int()

                val term: Node = parse__term(term_result)
                var exprP_result: int = int()

                val exprP: Node = parse__exprP(i - term_result, exprP_result)


                result.value = exprP_result.value;


                Node("NODE_exprP", listOf(MINUS, term, exprP))
            }
            CalculatorTokenType.EOF -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.RPAREN -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.TIMES -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.DIV -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.PLUS -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.MINUS -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.LPAREN -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.NUMBER -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.FACTORIAL -> {


                result.value = i.value


                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__term(result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.MINUS -> {
                var fact_result: int = int()

                val fact: Node = parse__fact(fact_result)
                var termP_result: int = int()

                val termP: Node = parse__termP(fact_result, termP_result)


                result.value = termP_result.value;


                Node("NODE_term", listOf(fact, termP))
            }
            CalculatorTokenType.LPAREN -> {
                var fact_result: int = int()

                val fact: Node = parse__fact(fact_result)
                var termP_result: int = int()

                val termP: Node = parse__termP(fact_result, termP_result)


                result.value = termP_result.value;


                Node("NODE_term", listOf(fact, termP))
            }
            CalculatorTokenType.NUMBER -> {
                var fact_result: int = int()

                val fact: Node = parse__fact(fact_result)
                var termP_result: int = int()

                val termP: Node = parse__termP(fact_result, termP_result)


                result.value = termP_result.value;


                Node("NODE_term", listOf(fact, termP))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__termP(i: int, result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.TIMES -> {
                var TIMES_text: string = string()

                val TIMES: Node = parse_token__TIMES(TIMES_text)
                var fact_result: int = int()

                val fact: Node = parse__fact(fact_result)
                var termP_result: int = int()

                val termP: Node = parse__termP(i * fact_result, termP_result)


                result.value = termP_result.value;


                Node("NODE_termP", listOf(TIMES, fact, termP))
            }
            CalculatorTokenType.DIV -> {
                var DIV_text: string = string()

                val DIV: Node = parse_token__DIV(DIV_text)
                var fact_result: int = int()

                val fact: Node = parse__fact(fact_result)
                var termP_result: int = int()

                val termP: Node = parse__termP(i / fact_result, termP_result)


                result.value = termP_result.value;


                Node("NODE_termP", listOf(DIV, fact, termP))
            }
            CalculatorTokenType.PLUS -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.MINUS -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.EOF -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.RPAREN -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.TIMES -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.DIV -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.LPAREN -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.NUMBER -> {


                result.value = i.value


                Node("EPS")
            }

            CalculatorTokenType.FACTORIAL -> {


                result.value = i.value


                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__fact(result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.MINUS -> {
                var MINUS_text: string = string()

                val MINUS: Node = parse_token__MINUS(MINUS_text)
                var atom_result: int = int()

                val atom: Node = parse__atom(atom_result)


                result.value = -atom_result.value;


                Node("NODE_fact", listOf(MINUS, atom))
            }
            CalculatorTokenType.LPAREN -> {
                var atom_result: int = int()

                val atom: Node = parse__atom(atom_result)
                var factP_result: int = int()

                val factP: Node = parse__factP(atom_result, factP_result)


                result.value = factP_result.value


                Node("NODE_fact", listOf(atom, factP))
            }
            CalculatorTokenType.NUMBER -> {
                var atom_result: int = int()

                val atom: Node = parse__atom(atom_result)
                var factP_result: int = int()

                val factP: Node = parse__factP(atom_result, factP_result)


                result.value = factP_result.value


                Node("NODE_fact", listOf(atom, factP))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__factP(i: int, result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.FACTORIAL -> {
                var FACTORIAL_text: string = string()

                val FACTORIAL: Node = parse_token__FACTORIAL(FACTORIAL_text)
                var factP_result: int = int()

                val factP: Node = parse__factP(i, factP_result)


                result.value = factorial(factP_result.value)


                Node("NODE_factP", listOf(FACTORIAL, factP))
            }
            CalculatorTokenType.TIMES -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.DIV -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.PLUS -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.MINUS -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.EOF -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.RPAREN -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.LPAREN -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.NUMBER -> {


                result.value = i.value;


                Node("EPS")
            }

            CalculatorTokenType.FACTORIAL -> {


                result.value = i.value;


                Node("EPS")
            }

            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse__atom(result: int): Node {
        return when (currentToken().type) {
            CalculatorTokenType.LPAREN -> {
                var LPAREN_text: string = string()

                val LPAREN: Node = parse_token__LPAREN(LPAREN_text)
                var expr_result: int = int()

                val expr: Node = parse__expr(expr_result)
                var RPAREN_text: string = string()

                val RPAREN: Node = parse_token__RPAREN(RPAREN_text)


                result.value = expr_result.value


                Node("NODE_atom", listOf(LPAREN, expr, RPAREN))
            }
            CalculatorTokenType.NUMBER -> {
                var NUMBER_text: string = string()

                val NUMBER: Node = parse_token__NUMBER(NUMBER_text)


                result.value = parseInt(NUMBER_text.value)


                Node("NODE_atom", listOf(NUMBER))
            }
            else -> throw Exception("Unexpected token in a state")
        }
    }

    fun parse_token__LPAREN(text: string): Node {
        expectedToken(CalculatorTokenType.LPAREN)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_LPAREN", listOf(Node(text.value)))
    }

    fun parse_token__RPAREN(text: string): Node {
        expectedToken(CalculatorTokenType.RPAREN)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_RPAREN", listOf(Node(text.value)))
    }

    fun parse_token__PLUS(text: string): Node {
        expectedToken(CalculatorTokenType.PLUS)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_PLUS", listOf(Node(text.value)))
    }

    fun parse_token__MINUS(text: string): Node {
        expectedToken(CalculatorTokenType.MINUS)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_MINUS", listOf(Node(text.value)))
    }

    fun parse_token__TIMES(text: string): Node {
        expectedToken(CalculatorTokenType.TIMES)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_TIMES", listOf(Node(text.value)))
    }

    fun parse_token__DIV(text: string): Node {
        expectedToken(CalculatorTokenType.DIV)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_DIV", listOf(Node(text.value)))
    }

    fun parse_token__FACTORIAL(text: string): Node {
        expectedToken(CalculatorTokenType.FACTORIAL)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_FACTORIAL", listOf(Node(text.value)))
    }

    fun parse_token__NUMBER(text: string): Node {
        expectedToken(CalculatorTokenType.NUMBER)
        text.value = currentToken().data!!
        skipToken()
        return Node("NODE_NUMBER", listOf(Node(text.value)))
    }

}
