package classes

fun main() {

    val signInButton = Taste("Sign In", 1738, object : OnClickListener{
        override fun onClick() {
            println("Sign In Successful")
        }

    }) // Implementing Object Expression

    val signUpButton = Taste("Sign Up", 2011, object : OnClickListener{
        override fun onClick() {
            println("Sign Up Successful")
        }
    })

    println(signUpButton.id)
}



interface OnClickListener {
    fun onClick()
}

interface Engine {
    fun startEngine()
}

class Taste(val text: String, val id: Int, onClickListener: OnClickListener)

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
        println("The Truck has stared the engine")
    }
}