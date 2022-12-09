package com.cursoandroid.ph.epadocarefatored

enum class ListItemsFood (val item: Item){
    FRENCHBREAD (item = Item(1, "Comida", "Pães", "Pão francês", 0.60)),
    MILKBREAD (item = Item(2, "Comida", "Pães", "Pão de Leite", 0.40)),
    CORNBREAD (item = Item(3, "Comida", "Pães", "Pão de Milho", 0.50)),
    CHICKENSNACK (item = Item(1, "Comida", "Salgados", "Coxinha", 5.00)),
    ESFIRRA (item = Item(2, "Comida", "Salgados", "Esfirra", 6.00)),
    CHEESEBREAD (item = Item(3, "Comida", "Salgados", "Pão de Queijo", 4.50)),
    CAROLINA (item = Item(1, "Comida", "Doces", "Carolina", 2.00)),
    PUDDING (item = Item(2, "Comida", "Doces", "Pudim", 4.00)),
    BRIGADIER(item = Item(3, "Comida", "Doces", "Brigadeiro", 4.00));

    override fun toString(): String {
        return """
            ${item.id} - ${item.name}...............R$${item.price}
        """.trimIndent()
    }
}