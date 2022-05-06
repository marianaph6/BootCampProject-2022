package SOLID

class Open {

    // Ejemplo del principio de apertura y cierre con animales
    fun main() {
        val dog = Dog()
        dog.move()
        dog.woof()
    }

    open class Animal {
        fun move() {
            println("I am moving!")
        }
    }

    // La clase Dog es capaz de añadir la funcionalidad woof()
    // pero la clase Dog es incapaz de cambiar la funcionalidad existente de move()
    class Dog: Animal() {
        fun woof() {
            println("woof!")
        }
    }
}