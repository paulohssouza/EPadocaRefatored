package com.cursoandroid.ph.epadocarefatored

class ListItemsDrink {
    fun listCoffes (): MutableList<Item> {
        val espresso = Item(1, "Bebida", "Cafés", "Café Expresso", 2.00)
        val cappuccino = Item(2, "Bebida", "Cafés", "Cappuccino", 3.50)
        val macchiato = Item(3, "Bebida", "Cafés", "Macchiato", 4.50)
        val list: MutableList<Item> = mutableListOf()
        list.add(espresso)
        list.add(cappuccino)
        list.add(macchiato)
        return list
    }

    fun listJuices (): MutableList<Item> {
        val orange = Item(1, "Bebida", "Juices", "Laranja", 6.00)
        val acerola = Item(2, "Bebida", "Juices", "Acerola", 5.00)
        val lemon = Item(3, "Bebida", "Juices", "Limão", 5.50)
        val list: MutableList<Item> = mutableListOf()
        list.add(orange)
        list.add(acerola)
        list.add(lemon)
        return list
    }

    fun listVarious (): MutableList<Item> {
        val cocoa = Item(1, "Bebida", "Leites, chás e chocolates",
            "Chocolate Quente", 7.00)
        val milk = Item(2, "Bebida", "Leites, chás e chocolates",
            "Leite", 3.00)
        val tea = Item(3, "Bebida", "Leites, chás e chocolates",
            "Chá", 4.00)
        val list: MutableList<Item> = mutableListOf()
        list.add(cocoa)
        list.add(milk)
        list.add(tea)
        return list
    }
}