package com.example.introkotlin_901.temasKotlin

fun main() {
    println("--------------FORMULA GENERAL--------------")

    var a: Double
    var b: Double
    var c: Double
    var discriminante: Double

    do {
        do {
            print("Ingresa el valor de a (no puede ser cero): ")
            a = readln().toDouble()
            if (a == 0.0) {
                println("'a' no puede ser cero. Ingresa un numero valido")
            }
        } while (a == 0.0)

        do {
            print("Ingresa el valor de b: ")
            b = readln().toDouble()
            if (b == 0.0) {
                println("'b' no puede ser cero. Ingresa un numero valido")
            }
        } while (b == 0.0)

        do {
            print("Ingresa el valor de c: ")
            c = readln().toDouble()
            if (c == 0.0) {
                println("'c' no puede ser cero. Ingresa un numero valido")
            }
        } while (c == 0.0)


        discriminante = b * b - 4 * a * c

        if (discriminante < 0) {
            println("ERROR: No hay soluciones reales (discriminante negativo). Ingresa nuevos valores.")
        }
    } while (discriminante < 0)

    val x1 = (-b + Math.sqrt(discriminante)) / (2 * a)
    val x2 = (-b - Math.sqrt(discriminante)) / (2 * a)

    println("Las soluciones de la ecuación son: x1 = $x1 y x2 = $x2")

}

