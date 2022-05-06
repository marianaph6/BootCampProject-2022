package SOLID

import kotlin.math.pow
import kotlin.math.PI

class Interface {

    // BAD: Esta clase viola el principio de segregación de interfaces
    // La interfaz BadShape obliga a BadSquare a calcular un radio
    // del cual no puede y no tiene uso

    interface BadShape {
        fun radius(): Double
        fun area(): Double
    }

    data class BadCircle(val diameter: Double): BadShape {
        override fun radius() = diameter / 2
        override fun area() = PI * radius().pow(2)
    }

    data class BadSquare(val width: Double, val height: Double): BadShape {
        override fun radius() = 0.0
        override fun area() = width * height
    }

    // BUENO: al dividir BadShape en Shape y CircularShape,
    // ya no tenemos que forzar a Square a implementar un radio

    interface Shape {
        fun area(): Double
    }

    interface CircularShape {
        fun radius(): Double
    }

    data class Circle(val diameter: Double): Shape, CircularShape {
        override fun radius() = diameter / 2
        override fun area() = PI * radius().pow(2)
    }

    data class Square(val width: Double, val height: Double): Shape {
        override fun area() = width * height
    }
}