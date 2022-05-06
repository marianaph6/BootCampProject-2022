package Arreglos

class Array {

    fun main() {
        val carros = arrayOf("Volvo", "BMW", "Ford", "Mazda","Ferrari")
        val carros2= arrayOf<String>("Volvo", "BMW", "Ford", "Mazda","Ferrari")

        //Carro en la posición 0
        println(carros[0])
        //Tmañao del Array
        println(carros.size)

        //Verificar si un auto existe en la lista
        if ("Volvo" in carros) {
            println("Existe!")
        } else {
            println("No existe")
        }

        if(carros.size >= 5){
            println(carros.get(2))
        }else{
            println("no tiene más parámetros la array")
        }

        //Recorrer array
        for (carro in carros) {
            println(carro)
        }

        for (posicion in carros.indices){
            println(carros[posicion])
        }

        for ((posicion, valor) in carros.withIndex()) {
            println("La posición $posicion contiene el valor $valor")
        }

        for (weekDay in carros) {
            println(weekDay)
        }
    }
}