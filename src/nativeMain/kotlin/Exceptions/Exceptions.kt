package Exceptions

class Exceptions {

    fun main(){

        OutOfBound()
        DividedByZero()
        NullPointerException()

    }

    fun OutOfBound(){

        val foodObjects : List<Char> = listOf('a','b','c','d','e')

        //Error OutOfBound
        for(i in  0..foodObjects!!.size)
        {
            println(i)

        }
        /*Los rangos en Kotlin son inclusivos, por lo tanto, 0..foodObjects!!.size
        * comienzan 0 y terminan en foodObjects.size, incluidos ambos extremos.
        * Esto provoca la excepción cuando su bucle intenta indexar la lista con su
        * propio tamaño, que es uno más que el índice válido más grande.
      */

        //Crear un rango que no incluya el límite superior ---> until

        //Solución OutOfBound
        for(i in 0 until foodObjects!!.size) {
            // ...
        }
    }
    fun DividedByZero(){

        val getOperator="/"
        val value1=4
        val value2=0
        var sum=0
        //Error
        if (getOperator === "/") {
            try {
                sum = value1 / value2
            } catch (e: ArithmeticException) {
                println("Operación invalida")
            }
        }

        //Solución
        if (getOperator=="/"){
            if (value2 == 0) {
                println("El valor dos no puede ser dividido por cero");
            } else {
                sum = value1/value2;
            }
        }
    }
    fun NullPointerException(){

        val x: Int? = null

        //Error
        /*val y = x.toDouble()
        if (x != null) {
            val y = x.toDouble()
        }
        */
        //Solución
        val y2 = x?.toDouble() ?: 0.0
    }
}