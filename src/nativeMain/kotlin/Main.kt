import Arreglos.Listas
import Exceptions.Exceptions
import TiposDato.TiposDato

fun main() {

    //Tipos de datos
    println("TIPOS DE DATOS")
    TiposDato().main()

    //Listas
    println("TIPOS DE LISTAS")
    Listas().main()

    //ARRAYS
    println("ARRAYS")
    Arreglos.Array().main()

    //SETS
    println("SETS")
    Arreglos.Set().main()

    //MAPS
    println("MAPS")
    Arreglos.Map().main()

    //EXCEPCIONES
    println("EXCEPCIONES")
    Exceptions().main()
}