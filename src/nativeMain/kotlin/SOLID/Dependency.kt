package SOLID

class Dependency {

    // MAL: Esta clase viola el Principio de Inversión de Dependencia
    // al crear la dependencia BookRepository dentro de Library


    data class Book(val name: String)

    class BookRepository(val apiKey: String) {
        fun getBooks(): List<Book> {
            val books = ArrayList<Book>()
            books.add(Book("Harry Potter"))
            return books
        }
    }

    class BadLibrary {
        fun list() = BookRepository(BOOK_API_KEY).getBooks()

        companion object {
            const val BOOK_API_KEY = "abc123"
        }
    }

// MEJOR: BookRepository se proporciona ahora en el constructor de Library,
// haciendo esta clase mucho más fácil de probar y mantener. Los cambios en el constructor
// constructor de BookRepository ya no afectan a la clase Library.

    class Library(private val repository: BookRepository) {
        fun list() = repository.getBooks()
    }
}