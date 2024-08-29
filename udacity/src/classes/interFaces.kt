package classes

interface Engine {
    fun startEngine()
}

class CarVehicle(val name: String, val engine: String, val model: String): Engine {
    override fun startEngine() {
        println("CarVehicle has stared the engine")
    }
}

class Tesla(val name: String, val engine: String, val model: String, val doors: Int): Engine {
    override fun startEngine() {
        println("Tesla has stared the engine")
    }
}

class Truck(val name: String, val engine: String, val model: String, val doors: Int): Engine {
    override fun startEngine() {
        println("Truck has stared the engine")
    }
}