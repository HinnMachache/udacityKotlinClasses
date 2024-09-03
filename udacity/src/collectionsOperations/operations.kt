package collectionsOperations

fun main() {
// Pairs
//    val equipment = "fishnet" to "catching fish" to "of big size " to "and strong"
//
//    println(equipment)
//    println(equipment.first)
//    println(equipment.first.first)
//    println(equipment.first.first.first)
//    println(equipment.second)
//
//    val tool = giveMeATool()
//    println(tool)
    bookInfo()
}

fun giveMeATool(): Pair<String, String> {
    return "fishnet" to "catching fish"
}

fun bookInfo() {
    // Create a book instance.
    // Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”
    val book = BookInfo("Phenomenon", "Silbeger", 2005)
    val (bookTitle, bookAuthor, bookYear) = book.fullInfo()
    println("Here is your book ${bookTitle} written by ${bookAuthor} in ${bookYear}")
}