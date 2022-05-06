package Arreglos

import kotlin.collections.Map
import kotlin.test.DefaultAsserter.assertNull
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Map {

    fun main(){

        //EJEMPLO 1
        val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
            Pair("españa", 46000000),
            Pair("uruguay", 3400000))

        println("Listado completo del Map")
        println(paises)

        for ((clave, valor) in paises)
            println("Para la clave $clave tenemos almacenado $valor")

        println("La cantidad de elementos del mapa es ${paises.size}")

        val cantHabitantes1: Int? = paises["argentina"]

        if (cantHabitantes1 != null)
            println("La cantidad de habitantes de argentina es $cantHabitantes1")
        val cantHabitantes2: Int? = paises["brasil"]
        if (cantHabitantes2 != null)
            println("La cantidad de habitantes de brasil es $cantHabitantes2")
        else
            println("brasil no se encuentra cargado en el Map")

        var suma = 0
        paises.forEach { suma += it.value }
        println("Cantidad total de habitantes de todos los paises es $suma")


        //EJEMPLO 2

        val iceCreamInventory = LinkedHashMap<String, Int>()
        iceCreamInventory["Vanilla"] = 24

        val shipments = listOf(
            IceCreamShipment("Chocolate", 3),
            IceCreamShipment("Strawberry", 7),
            IceCreamShipment("Vanilla", 5),
            IceCreamShipment("Chocolate", 5),
            IceCreamShipment("Vanilla", 1),
            IceCreamShipment("Rocky Road", 10),
        )

        val map = mapOf("Vanilla" to 24)

        //ACCERDER A ENTIDADES
        assertEquals(24, map.get("Vanilla"))
        assertEquals(24, map["Vanilla"])

        val iceCreamSales = mutableMapOf<String, Int>()

        //AÑADIR ELEMENTOS
        iceCreamSales.put("Chocolate", 1)
        iceCreamSales["Vanilla"] = 2

        iceCreamSales.putAll(setOf("Strawberry" to 3, "Rocky Road" to 2))
        iceCreamSales += mapOf("Maple Walnut" to 1, "Mint Chocolate" to 4)

        //REMOVER ELEMENTOS

        val map2 = mutableMapOf("Chocolate" to 14, "Strawberry" to 9)

        map2.remove("Strawberry")
        map2 -= "Chocolate"
        assertNull(map2["Strawberry"])
        assertNull(map2["Chocolate"])


    }
}

class IceCreamShipment(s: String, i: Int) {

}
