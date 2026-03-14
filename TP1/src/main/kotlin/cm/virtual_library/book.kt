package cm.virtual_library

abstract class Book(val title: String, val author: String, val publicationYear: Int) {
    var availableCopies: Int = 0
        set(value) {
            if (value < 0) {
                println("Warning: Cannot have negative copies!")
            } else {
                field = value
                if (field == 0) {
                    println("Warning: Book is now out of stock!")
                }
            }
        }

    val yearCategory: String
        get() = when {
            publicationYear < 1980 -> "Classic"
            publicationYear in 1980..2010 -> "Modern"
            else -> "Contemporary"
        }

    abstract fun getStorageInfo(): String

    init {
        println("Book '$title' by $author has been added to the library.")
    }

    override fun toString(): String {
        return "$title by $author, Year: $publicationYear, Available Copies: $availableCopies"
    }

    open fun showDetails() {
        println(this.toString())
    }
}