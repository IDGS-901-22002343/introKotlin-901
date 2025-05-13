package com.example.introkotlin_901.temasKotlin

class Circulo(val radio: Double) {
    fun calcularArea(): Double = (3.141592 * (radio * radio))
}

class Cuadrado(val lado: Double) {
    fun calcularArea(): Double = (lado * lado)
}

class Triangulo(val base: Double, val altura: Double) {
    fun calcularArea(): Double = (base * altura) / 2
}

class Pentagono(val lado: Double, val apotema: Double) {
    fun calcularArea(): Double = ((5 * lado) * apotema) / 2
}

class CalculadoraAreas{
    fun mostrarMenu(){
        println("-------------Calculadora de Areas-------------")
        println("1. Calcular Area de un Circulo")
        println("2. Calcular Area de un Cuadrado")
        println("3. Calcular Area de un Pentagono")
        println("4. Calcular Area de un Triangulo")
        println("5. Salir")
        print("Selecciona una opcion: ")
    }


    fun calcularAreaCirculo(){
        print("Ingresa el radio del circulo: ")
        var radio = readln().toDouble()
        var circulo = Circulo(radio)
        var area = circulo.calcularArea()
        println("El area del circulo es: $area")
    }

    fun calcularAreaCuadrado(){
        print("Ingresa el lado del cuadrado: ")
        var lado = readln().toDouble()
        var cuadrado = Cuadrado(lado)
        var area = cuadrado.calcularArea()
        println("El area del cuadrado es: $area")
    }

    fun calcularAreaTriangulo(){
        print("Ingresa la base del triangulo: ")
        var base = readln().toDouble()
        print("Ingresa la altura del triangulo: ")
        var altura = readln().toDouble()
        var triangulo = Triangulo(base, altura)
        var area = triangulo.calcularArea()
        println("El area del triangulo es: $area")
    }

    fun calcularAreaPentagono(){
        print("Ingresa el lado del pentagono: ")
        var lado = readln().toDouble()
        print("Ingresa el apotema del pentagono: ")
        var apotema = readln().toDouble()
        var pentagono = Pentagono(lado, apotema)
        var area = pentagono.calcularArea()
        println("El area del pentagono es: $area")
    }



    fun iniciar(){
        var opcion:Int
        do{
            mostrarMenu()
            opcion = readln().toInt()
            when(opcion) {
                1 -> calcularAreaCirculo()
                2 -> calcularAreaCuadrado()
                3 -> calcularAreaPentagono()
                4 -> calcularAreaTriangulo()
                5 -> println("----------------GRACIAS POR USAR LA CALCULADORA :)----------------")
                else -> println("Opcion no valida")
            }
            println("-----------------THANKIUNETS----------------")
    }while(opcion != 5)
}
}

fun main(){
    var calculadora = CalculadoraAreas()
    calculadora.iniciar()
}




























