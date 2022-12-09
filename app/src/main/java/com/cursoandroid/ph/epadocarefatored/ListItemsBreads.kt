package com.cursoandroid.ph.epadocarefatored

enum class ListItemsBreads (val item: Item){

    FRENCHBREAD (item = Item(1, "Comida", "Pães", "Pão francês", 0.60)),
    MILKBREAD (item = Item(2, "Comida", "Pães", "Pão de Leite", 0.40)),
    CORNBREAD (item = Item(3, "Comida", "Pães", "Pão de Milho", 0.50));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}