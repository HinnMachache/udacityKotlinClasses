package collections

fun main() {

    val firstNames = listOf<String>("John", "Jack", "Julius")   // Immutable List

    //firstNames.forEach { println(it) }

    val lastNames = mutableListOf("Doe", "Blue", "Nyerere")

    lastNames.add("Kingston")
    //lastNames.forEach { println(it) }

    val name1 = User("Name 1")
    val name2 = User("Name 2")
    val name3 = User("Name 3")
    val name4 = User("Name 1")

    val nameSets = setOf<String>("Name 1", "Name 2", "Name 3", "Name 1")

    //nameSets.forEach { println(it) }

    val namesSet = mutableSetOf("Name 1", "Name 2", "Name 3")
    namesSet.add("Name 2")
    //namesSet.forEach { println(it) }

    val userNames = setOf<User>(name1, name2, name3, name4)
    userNames.forEach { println(it.name) }

    val phoneBook = mapOf<Int, String>(1 to "Aname", 2 to "Ann", 3 to "Zeze")

    phoneBook.forEach { (t, u) ->
        println("$t to $u")
    }

    val addressBook = mutableMapOf<Int, String>(1 to "Kills", 2 to "Miles")
    addressBook[3] = "Smiley"
    addressBook.forEach { (t, u) ->
        println("$t to $u")
    }

}

class User(val name: String)