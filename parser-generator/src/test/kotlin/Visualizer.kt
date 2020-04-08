class Visualizer(private val node: Node) {
    private var shift = 0
    private val result = StringBuilder()

    fun visualize(): String {
        result.clear()
        visualize(node)
        return result.toString()
    }

    private fun visualize(node: Node) {
        repeat(shift / 4) { result.append("|   ") }
        result.appendln(node.name)
        shift += 4
        node.children.forEach { visualize(it) }
        shift -= 4
    }
}