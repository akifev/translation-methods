class Rule(
    var items: MutableList<Item> = mutableListOf()
) {
    fun addItem(item: Item) = items.plusAssign(item)
}