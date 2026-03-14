package cm.virtual_library

fun main() {
    val library = Library()

    // Criar livros
    val book1 = DigitalBook("Kotlin in Action", "Dmitry Jemerov", 2017, 4.5, "PDF")
    val book2 = PhysicalBook("Clean Code", "Robert C. Martin", 2008, 650.0)
    val book3 = PhysicalBook("1984", "George Orwell", 1949, 400.0, hasHardcover = false)

    // Adicionar livros à biblioteca
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    // Definir o número de cópias
    book1.availableCopies = 5
    book2.availableCopies = 3
    book3.availableCopies = 2

    // Mostrar todos os livros
    library.showBooks()

    // Empréstimo de livros
    library.borrowBook("Clean Code")
    library.borrowBook("1984")
    library.borrowBook("1984")

    // Devolução de livro
    library.returnBook("1984")

    // mostrar novamente os livros
    library.showBooks()

    // Buscar por autor
    library.searchByAuthor("George Orwell")

    // Registar membros
    val member1 = LibraryMember("Alice", 101)
    val member2 = LibraryMember("Bob", 102)
    library.registerMember(member1)
    library.registerMember(member2)

    // mostrar membros
    library.showMembers()
}