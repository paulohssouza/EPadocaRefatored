package com.cursoandroid.ph.epadocarefatored

enum class ListItemsCandies (val item: Item){

    CAROLINA (item = Item(1, "Comida", "Doces", "Carolina", 2.00)),
    PUDDING (item = Item(2, "Comida", "Doces", "Pudim", 4.00)),
    BRIGADIER(item = Item(3, "Comida", "Doces", "Brigadeiro", 4.00));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}