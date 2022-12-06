package com.cursoandroid.ph.epadocarefatored

class Item (val id: Int, val type: String, val category: String, val name: String, val price: Double) {
    fun calcPrice (amount: Int): Double {
        return price * amount.toDouble()
    }
}