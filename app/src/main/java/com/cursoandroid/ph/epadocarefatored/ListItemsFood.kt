package com.cursoandroid.ph.epadocarefatored

class ListItemsFood {
    fun listBreads (): MutableList<Item> {
        val frenchBread = Item(1, "Comida", "Pães", "Pão Francês", 0.60)
        val milkBread = Item(2, "Comida", "Pães", "Pão de Leite", 0.40)
        val cornBread = Item(3, "Comida", "Pães", "Pão de Milho", 0.50)
        val list: MutableList<Item> = mutableListOf()
        list.add(frenchBread)
        list.add(milkBread)
        list.add(cornBread)
        return list
    }

    fun listSnacks (): MutableList<Item> {
        val chickenSnack = Item(1, "Comida", "Salgados", "Coxinha", 5.00)
        val esfirra = Item(2, "Comida", "Salgados", "Esfirra", 6.00)
        val cheeseBread = Item(3, "Comida", "Salgados", "Pão de Queijo", 4.50)
        val list: MutableList<Item> = mutableListOf()
        list.add(chickenSnack)
        list.add(esfirra)
        list.add(cheeseBread)
        return list
    }

    fun listCandies (): MutableList<Item> {
        val carolina = Item(1, "Comida", "Doces", "Carolina", 2.00)
        val pudding = Item(2, "Comida", "Doces", "Pudim", 4.00)
        val brigadier = Item(3, "Comida", "Doces", "Brigadeiro", 4.00)
        val list: MutableList<Item> = mutableListOf()
        list.add(carolina)
        list.add(pudding)
        list.add(brigadier)
        return list
    }
}