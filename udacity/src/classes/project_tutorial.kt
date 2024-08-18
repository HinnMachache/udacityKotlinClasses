package classes

class Car(var name: String, var model: String, var color: String, var doors: Int) {

    fun move() {
        println("The car ${name} is moving")
    }

    fun stop() {
        println("The car ${name} has stopped")
    }
}

class User(var name: String, var Lname: String, var age: Int) {
//    var name: String

//    init {
//        if (name.lowercase().startsWith('a')){
//            this.name = name
//        }
//        else {
//            this.name = "User"
//        }
//
//        if (this.age < 18) {
//            println("You need to acquire an ID")
//        }
//
//        println("First name: ${this.name}")
//        println("Last name: ${this.Lname}")
//        println("Age: ${this.age}")
//    }

    //    init {
//        println("Name = ${this.name}")
//        println("Last Name = ${this.Lname}")
//        println("age = ${this.age}")
//    }
    constructor(name: String) : this(name, Lname = "Last_Name", age = 0) {
        println("Use 2nd")
        println("Name = ${this.name}")
        println("Last Name = ${this.Lname}")
        println("age = ${this.age}")
    }

    constructor(name: String, Lname: String) : this(name, Lname, age = 0) {
        println("Use 3rd")
        println("Name = ${this.name}")
        println("Last Name = ${this.Lname}")
        println("age = ${this.age}")
    }


}

class Customer(var Fname: String, var Lname: String = "Last_name", var age: Int = 0) {
    init {
        println("First Name: ${this.Fname}")
        println("Last Name: ${this.Lname}")
        println("Age: ${this.age}")

    }
}

class Movie(var name: String, var releaseDate: String, review: String) {
    lateinit var dateRelease: String
}

class Calculator() {
    companion object {  // Companion Object for calculator
        fun sum(num1: Int, num2: Int): Int {
            return num1 + num2
        }
    }
}

class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}

object NetworkConfig {
    init {
        println("Network Configured")   // Singleton Object
    }
}

