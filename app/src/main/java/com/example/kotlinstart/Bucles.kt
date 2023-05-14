package com.example.kotlinstart

private const val SEPARATOR = "===="

fun main() {
    showsPersons("Angel", "Mary")
}

fun showsPersons(vararg persons: String) {
    for (person in persons) {
        println(person)
        println(SEPARATOR)
    }
}

fun showNumber(number: Int) {
    println("Tengo $number manzanas")
}