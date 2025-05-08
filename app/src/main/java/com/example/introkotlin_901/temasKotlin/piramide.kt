package com.example.introkotlin_901.temasKotlin

fun main() {
    var num: Int

    do {
        println("----- PIRAMIDE DE ASTERISCOS -----")
        print("Ingresa un número (0 para salir): ")
        num = readln().toInt()

        if (num != 0) {
            println("\nPiramide:")
            for (i in 1..num) {
                for (j in 1..i) {
                    print("*")
                }
                println()
            }
            println()
        }
    } while (num != 0)

    println(":)")
}