package com.example.introkotlin_901.temasKotlin

fun main(){

    var opcion:Int

    do{
        println("-------------Calculadora de Areas-------------")
        println("1. Calcular Area de un Circulo")
        println("2. Calcular Area de un Cuadrado")
        println("3. Calcular Area de un Pentagono")
        println("4. Calcular Area de un Triangulo")
        println("5. Salir")
        print("Selecciona una opcion: ")
        opcion = readln().toInt()

        when(opcion) {
            1 -> {
                print("Ingresa el radio del circulo: ")
                var radio = readln().toDouble()
                var area = 3.141592 * (radio * radio)
                println("El area del circulo es: $area")
            }

            2 -> {
                print("Ingresa el lado del cuadrado: ")
                var lado = readln().toDouble()
                var area = (lado * lado)
                println("El area del cuadrado es: $area")
            }

            3 -> {
                print("Ingresa la base del pentagono: ")
                var base = readln().toDouble()
                print("Ingresa la altura del pentagono: ")
                var altura = readln().toDouble()
                var area = (base * altura) / 2
                println("El area del pentagono es: $area")
            }

            4 -> {
                print("Ingresa la base del triangulo: ")
                var base = readln().toDouble()
                print("Ingresa la altura del triangulo: ")
                var altura = readln().toDouble()
                var area = (base * altura) / 2
                println("El area del triangulo es: $area")
            }

            5 -> {
                println("----------------GRACIAS POR USAR LA CALCULADORA :)----------------")
            }

            else -> {
                println("Opcion no valida")
            }
        }
    }while(opcion != 5)
    println("-----------------THANKIUNETS----------------")
}