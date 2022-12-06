package com.cursoandroid.ph.epadocarefatored

class Menu {
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
                    optionCategory = readln().toInt()
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
                    optionCategory = readln().toInt()
                }
                else -> println("Digite uma opção válida!")
            }
        } while (optionCategory != 0)
    }
}