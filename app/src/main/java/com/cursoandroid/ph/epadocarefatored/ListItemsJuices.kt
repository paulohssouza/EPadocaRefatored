package com.cursoandroid.ph.epadocarefatored

enum class ListItemsJuices (val item: Item){

    ORANGE (item = Item(1, "Bebida", "Juices", "Laranja", 6.00)),
    ACEROLA (item = Item(2, "Bebida", "Juices", "Acerola", 5.00)),
    LEMON (item = Item(3, "Bebida", "Juices", "Limão", 5.50));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}