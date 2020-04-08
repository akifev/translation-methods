class State(
    var name: String? = null,
    var parameters: MutableList<Pair<String, String>> = mutableListOf(),
    var returns: MutableList<Pair<String, String>> = mutableListOf(),
    var locals: MutableList<Pair<String, String>> = mutableListOf(),
    var init: String? = null,
    var rules: MutableList<Rule> = mutableListOf()
) {
    private val first: Set<String> = HashSet()
    private val follow: Set<String> = HashSet()
    private val hasEpsilon = false

    fun addRule(rule: Rule) = rules.plusAssign(rule)
    fun addParameter(type: String, name: String) = parameters.plusAssign(Pair(type, name))
    fun addReturn(type: String, name: String) = returns.plusAssign(Pair(type, name))
    fun addLocal(type: String, name: String) = locals.plusAssign(Pair(type, name))

    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append('@')
        sb.append(name)


        return sb.toString()
    }
}