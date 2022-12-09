package com.cursoandroid.ph.epadocarefatored

enum class ListItemsSnacks (val item: Item){

    CHICKENSNACK (item = Item(1, "Comida", "Salgados", "Coxinha", 5.00)),
    ESFIRRA (item = Item(2, "Comida", "Salgados", "Esfirra", 6.00)),
    CHEESEBREAD (item = Item(3, "Comida", "Salgados", "Pão de Queijo", 4.50));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}