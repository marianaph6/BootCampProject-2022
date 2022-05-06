package SOLID

class Liskov {

// Ejemplo del principio de sustitución de Liskov

// Cuando se ejecuta main(), VehicleRepository.getAll() devolverá una lista
// de vehículos. Uno será un subtipo Coche y otro será un
// subtipo Campervan. Ambos serán accesibles bajo la interfaz
// del objeto Vehículo

    fun main() {
        val vehicles: List<Vehicle> = VehicleRepository().getAll()
        for (vehicle in vehicles) {
            println(vehicle.registration)
        }
    }

    open class Vehicle(val registration: String)

    data class Car(val reg: String) : Vehicle(reg)

    data class Campervan(val reg: String, val numberOfBeds: Int) : Vehicle(reg)

    class VehicleRepository {
        fun getAll(): List<Vehicle> {
            val vehicles: MutableList<Vehicle> = ArrayList()
            vehicles.add(Car(reg = "AB66 GHJ"))
            vehicles.add(Campervan(reg = "CA66 MPR", numberOfBeds = 2))
            return vehicles
        }
    }
}