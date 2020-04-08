class Grammar(
    var name: String? = null,
    var header: String? = null,
    var members: String? = null,
    var states: MutableList<State> = mutableListOf(),
    var tokens: MutableList<StateToken> = mutableListOf()
) {
    fun addState(state: State) = states.plusAssign(state)
    fun addToken(token: StateToken) = tokens.plusAssign(token)

    fun getFirst(items: MutableList<Item>): List<String> {
        if (items.isEmpty() || items[0].name == "EPS") return listOf("EPS")

        val maybeToken: StateToken? = this.tokens.find { it.name == items[0].name }
        if (maybeToken != null) return listOf(items[0].name!!)

        val first = FIRST[items[0].name!!]!!
        return (first - "EPS").toList() + if ("EPS" in first) getFirst(items.drop(1).toMutableList()) else listOf()
    }

    fun buildFirst(): MutableMap<String, MutableSet<String>> {
        this.states.forEach {
            FIRST[it.name!!] = mutableSetOf()
        }

        var changed: Boolean
        do {
            changed = false
            for (state in this.states) {
                val size = FIRST[state.name]!!.size

                state.rules.forEach { rule ->
                    FIRST[state.name]!! += getFirst(rule.items)
                    changed = changed || (size != FIRST[state.name]!!.size)
                }
            }
        } while (changed)

        return FIRST
    }

    fun buildFollow(): MutableMap<String, MutableSet<String>> {
        this.states.forEach {
            FOLLOW[it.name!!] = mutableSetOf()
        }
        FOLLOW[this.states[0].name!!]!! += "EOF"

        var changed: Boolean
        do {
            changed = false
            for (state in this.states) {
                state.rules.forEach { rule ->
                    rule.items.forEachIndexed { index, a ->
                        val maybeState: State? = this.states.find { it.name == a.name }

                        if (maybeState != null) {
                            val size = FOLLOW[a.name]!!.size

                            state.rules.forEach { rule ->
                                val gamma = getFirst(rule.items.drop(index + 1).toMutableList())
                                FOLLOW[a.name]!! += (gamma - "EPS").toList()
                                if ("EPS" in gamma) FOLLOW[a.name]!! += FOLLOW[state.name]!!
                                changed = changed || (size != FOLLOW[a.name]!!.size)
                            }
                        }
                    }
                }
            }
        } while (changed)

        return FOLLOW
    }

    var FIRST: MutableMap<String, MutableSet<String>> = mutableMapOf()
    var FOLLOW: MutableMap<String, MutableSet<String>> = mutableMapOf()
}