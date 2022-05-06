package Arrays

class Listas {

    fun main(){
        println()
        println("LISTAS INMUTABLES")
        InmutableList()
        println("LISTAS MUTABLES")
        MutableList()
        println("RECORRER LISTAS")
        RecorrerListas()
        println()
    }

    //INMUTABLES ---> No cambian su contenido

    fun InmutableList(){

        /*Para crear una lista de solo lectura usa la función listOf(), la cual
        recibe como argumentos un grupo de ítems de un mismo tipo */

        val abecedario: List<Char> = listOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')

        println(abecedario) //Imprimir arreglo

        println("Tamaño lista: " +abecedario.size + "\n"+
        "Valor en la posición 2: "+abecedario[2] + "\n"+
        "Última posición de la letra J: "+ abecedario.lastIndexOf('j')+ "\n"+
        "Posición de la letra Ñ: "+ abecedario.indexOf('ñ')+ "\n"+
        "Primer valor de la lista: "+ abecedario.first()+ "\n"+
        "Último valor de la lista: "+abecedario.last()+ "\n"+
        "El dato '5' esta en la lista: "+ abecedario.contains('5')+ "\n"+
        "Lista al reverso: "+ abecedario.asReversed()+ "\n"+
        "Lista ordenada de manera descendente: "+abecedario.sortedDescending()+ "\n"+
        "Cantidad de elemntos en la lista: "+abecedario.count()+ "\n"+
        "Sublista de abacedario: "+abecedario.subList(0, 2))

    }

    //MUTABLES ---> Pueden modificar su contendio

    fun MutableList(){

        val mercado: MutableList<String> = mutableListOf("Leche", "Huevos", "Harina","Brocoli","Avena","Maiz","Café")

        println("Lista impresa: $mercado")
        println("Tamaño lista: " +mercado.size)
        //Añadir a la lista el item de 'Platano'
        mercado.add("Platano")
        //Añadir a la lista el item de 'Fresas' en la posición 3
        mercado.add(4, "Fresas")
        //Remover el item de la posición 2 de la lista
        mercado.removeAt(2)
        //Remover el item llamado 'Leche'
        mercado.remove("Leche")
        //Añadir a la lista el item de 'Yogurt' en la posición 1
        mercado[1] = "Yogurt"

        println("Lista ordenada de manera descendente: "+mercado.sortDescending())
        //Devuelve un true si está vacía la lista
        mercado.none()
        //Devolverá el primer campo, y si no hay, un null.
        mercado.firstOrNull()
        //El elemento del índice 2, si no hay, devolverá un null
        mercado.elementAtOrNull(2)
        //Último valor de la lista o null
        mercado.lastOrNull()


    }

    fun RecorrerListas(){


        var mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")

        //Metodo 1
        for (item in mutableList) {
            print(item)
        }

        //Metodo 2
        for ((indice, item) in mutableList.withIndex()) {
            println("La posición $indice contiene $item")
        }

        val numbers = listOf("one", "two", "three", "four")
        val numbersIterator = numbers.iterator()

        //Metodo 3
        while (numbersIterator.hasNext()) {
            println(numbersIterator.next())
        }

        //Metodo 4
        numbers.forEach {
            println(it)
        }


    }


}