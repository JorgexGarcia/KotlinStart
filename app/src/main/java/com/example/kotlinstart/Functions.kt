package com.example.kotlinstart

import kotlin.math.abs

fun main() {
    sum(2, 4)
    println(sum(2, 4))
}

private fun sum(a: Int, b: Int): Int {
    return a + b
}

//Para crear nuevos metodos al tipo Int
infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

fun showProduct(name: String, promo: String = ""){
    println(name)
    println(promo)
}
