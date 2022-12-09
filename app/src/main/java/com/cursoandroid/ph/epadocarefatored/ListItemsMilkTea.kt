package com.cursoandroid.ph.epadocarefatored

enum class ListItemsMilkTea (val item: Item) {

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