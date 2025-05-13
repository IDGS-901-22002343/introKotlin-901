package com.example.introkotlin_901.temasKotlin

class usuarios(){
    val materia : String = ""
}

class usuarios2(val id:Int, val nombre:String){
    val materia : String = ""
    fun hola(){
        println("Hola")
    }
}

fun main(){
    val alumnos  = usuarios()
    val alumnno2 = usuarios2(1, "Carlos")

    println(alumnno2.id)
    println(alumnno2.nombre)
    alumnno2.hola()
}