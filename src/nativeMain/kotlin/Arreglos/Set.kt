package Arreglos

class Set {

    fun main(){

        //Declarar Set de Strings
        val seta = setOf<String>("Geeks" , "for", "geeks")
        //Declarar Set de Chars
        val setb = setOf<Char>( 'G' , 'H' , 'L' )
        //Declarar set de enteros
        val setc = setOf<Int>( 1 ,2 , 3 , 4 )

        //Recorrer Sets
        for(item in seta)
            print( item )
        println()

        for(item in setb)
            print( item )
        println()

        for(item in setc)
            print( "$item ")

        val capitanes = setOf("Kohli","Smith","Root","Malinga","Rohit","Dhawan")

        println("El elemento en la posición 2 es: "+capitanes.elementAt(2))

        println("La posición de 'Smith' es: "+capitanes.indexOf("Smith"))

        println("La última posición del elemento 'Rohit': "+capitanes.lastIndexOf("Rohit"))

        //Igualdad de conjuntos

        val a = setOf(1, 2, 3, 4, 4, 4)
        println(a == setOf(1, 2, 3, 4))

        println(setOf(1, 2, 3) == setOf(2, 3, 1))

        //SETS MUTABLES

        val setA = mutableSetOf(1, 6, 7, 10)
        val setB = mutableSetOf<Int>()
        println("A=$setA y B=$setB")

        // Añadir elementos
        setB.add(1) // [1]
        setB += 2   // [1,2]
        setB += 2   // [1,2]
        println(setB)

        // Remover elementos
        setB.remove(1)   // [2]
        setB -= 2        // []
        setB -= 3        // []

        println(setB)
    }
}