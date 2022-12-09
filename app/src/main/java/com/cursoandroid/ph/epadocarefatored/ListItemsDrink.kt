package com.cursoandroid.ph.epadocarefatored

enum class ListItemsDrink (val item: Item) {
    ESPRESSO (item = Item(1, "Bebida", "Cafés", "Café Expresso", 2.00)),
    CAPPUCCINO (item = Item(2, "Bebida", "Cafés", "Cappuccino", 3.50)),
    MACCHIATO (item = Item(3, "Bebida", "Cafés", "Macchiato", 4.50)),
    ORANGE (item = Item(1, "Bebida", "Juices", "Laranja", 6.00)),
    ACEROLA (item = Item(2, "Bebida", "Juices", "Acerola", 5.00)),
    LEMON (item = Item(3, "Bebida", "Juices", "Limão", 5.50)),
    COCOA (item = Item(1, "Bebida", "Leites, chás e chocolates",
            "Chocolate Quente", 7.00)),
    MILK (item = Item(2, "Bebida", "Leites, chás e chocolates",
            "Leite", 3.00)),
    TEA (item = Item(3, "Bebida", "Leites, chás e chocolates",
            "Chá", 4.00));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}