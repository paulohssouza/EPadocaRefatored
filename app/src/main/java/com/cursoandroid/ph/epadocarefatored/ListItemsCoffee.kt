package com.cursoandroid.ph.epadocarefatored

enum class ListItemsCoffee (val item: Item) {

    ESPRESSO (item = Item(1, "Bebida", "Cafés", "Café Expresso", 2.00)),
    CAPPUCCINO (item = Item(2, "Bebida", "Cafés", "Cappuccino", 3.50)),
    MACCHIATO (item = Item(3, "Bebida", "Cafés", "Macchiato", 4.50));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}