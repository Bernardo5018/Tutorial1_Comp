package cm.virtual_library

class Library {
    private val books = mutableListOf<Book>()
    private val members = mutableListOf<LibraryMember>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun borrowBook(title: String): Boolean {
        val book = books.find { it.title == title }
        return if (book != null && book.availableCopies > 0) {
            book.availableCopies--
            println("\n--- Borrowing Book ---")
            println("Successfully borrowed '$title'. Copies remaining: ${book.availableCopies}")
            true
        } else {
            println("Sorry, '$title' is out of stock.")
            false
        }
    }

    fun returnBook(title: String): Boolean {
        val book = books.find { it.title == title }
        return if (book != null) {
            book.availableCopies++
            println("\n--- Returning Book ---")
            println("Book '$title' returned successfully. Copies available: ${book.availableCopies}")
            true
        } else {
            println("Book not found.")
            false
        }
    }

    fun showBooks() {
        println("\n--- Library Catalog ---")
        books.forEach { it.showDetails() }
    }

    fun searchByAuthor(author: String) {
        val booksByAuthor = books.filter { it.author == author }
        println("\n--- Search by Author ---")
        if (booksByAuthor.isNotEmpty()) {
            booksByAuthor.forEach {
                println("Books by $author: ")
                println(" - '${it.title}' (${it.yearCategory}, ${it.availableCopies} copies available)")
            }
        } else {
            println("No books found by $author.")
        }
    }

    fun registerMember(member: LibraryMember) {
        members.add(member)
    }

    fun showMembers() {
        println("\n--- Library Members ---")
        members.forEach { println(it) }
    }
}