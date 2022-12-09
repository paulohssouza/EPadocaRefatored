package com.cursoandroid.ph.epadocarefatored

class Menu {
    val request: Request = Request(mutableListOf())
    fun typeMenu () {
        var optionType = 1
        do {
            println("""
                ==========Bem vindo a E-Padoca==========
                      Selecione uma opção do menu:
                        1................Comidas
                        2................Bebidas
                        0................Finalizar
                Opção:
            """.trimIndent())
            try {
                optionType = readln().toInt()
                if (optionType != 0) {
                    categoryMenu(optionType)
                }
            } catch (e: java.lang.NumberFormatException) {
                println("Digite uma opção válida!")
            }
        } while (optionType != 0)
    }

    private fun categoryMenu (type: Int) {
        var optionCategory = 0
        do{
            when (type) {
                1 -> {
                    println("""
                    Selecione sua opção de comida:
                    1................Pães
                    2................Salgados
                    3................Doces
                    0................Voltar
                    Opção:
                """.trimIndent())
                    try {
                        optionCategory = readln().toInt()
                        if (optionCategory != 0) {
                            foodMenu(optionCategory)
                        }
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                2 -> {
                    println("""
                    Selecione sua opção de comida:
                    1................Cafés
                    2................Sucos
                    3................Leites, chás e chocolates
                    0................Voltar
                    Opção:
                """.trimIndent())
                    try {
                        optionCategory = readln().toInt()
                        if (optionCategory != 0) {
                            drinkMenu(optionCategory)
                        }
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                else -> println("Digite uma opção válida!")
            }
        } while (optionCategory != 0)
    }

    private fun foodMenu (category: Int) {
        var option = 0
        do {
            when (category) {
                1 -> {
                    println("Digite sua opção:")
                    println(ListItemsBreads.FRENCHBREAD.toString())
                    println(ListItemsBreads.MILKBREAD.toString())
                    println(ListItemsBreads.CORNBREAD.toString())
                    println("0 - Voltar")
                    println ("Opção:")
                    try {
                        option = readln().toInt()
                    } catch(e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                2 -> {
                    println("Digite sua opção:")
                    println(ListItemsSnacks.CHICKENSNACK.toString())
                    println(ListItemsSnacks.ESFIRRA.toString())
                    println(ListItemsSnacks.CHEESEBREAD.toString())
                    println("0 - Voltar")
                    println("Opção:")
                    try {
                        option = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                3 -> {
                    println("Digite sua opção:")
                    println(ListItemsCandies.CAROLINA.toString())
                    println(ListItemsCandies.BRIGADIER.toString())
                    println(ListItemsCandies.PUDDING.toString())
                    println("0 - Voltar")
                    println("Opção:")
                    try {
                        option = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                else -> println("Digite uma opção válida!")
            }
        } while (option != 0)
    }

    private fun drinkMenu (category: Int) {
        var option = 0
        do {
            when (category) {
                1 -> {
                    println("Digite sua opção:")
                    println(ListItemsCoffee.ESPRESSO.toString())
                    println(ListItemsCoffee.CAPPUCCINO.toString())
                    println(ListItemsCoffee.MACCHIATO.toString())
                    println("0 - Voltar")
                    println("Opção:")
                    try {
                        option = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                2 -> {
                    println("Digite sua opção:")
                    println(ListItemsJuices.ORANGE.toString())
                    println(ListItemsJuices.ACEROLA.toString())
                    println(ListItemsJuices.LEMON.toString())
                    println("0 - Voltar")
                    println("Opção:")
                    try {
                        option = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                3 -> {
                    println("Digite sua opção:")
                    println(ListItemsMilkTea.COCOA.toString())
                    println(ListItemsMilkTea.MILK.toString())
                    println(ListItemsMilkTea.TEA.toString())
                    println("0 - Voltar")
                    println("Opção:")
                    try {
                        option = readln().toInt()
                    } catch (e: NumberFormatException) {
                        println("Digite uma opção válida!")
                    }
                }
                else -> println("Digite uma opção válida!")
            }
        } while (option != 0)
    }

}