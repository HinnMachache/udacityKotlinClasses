package collectionsOperations

class BookInfo(val title: String, val author: String, val year: Int) {

    fun info(): Pair<String, String> {
        return this.title to this.author

    }

    fun fullInfo(): Triple<String, String, Int> {
        return Triple(this.title, this.author, this.year)
    }
}