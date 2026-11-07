fun main() {
    val library: List<Media> = listOf(
        Book("Il Signore degli Anelli", 1954, "J.R.R. Tolkien"),
        Film("Inception", 2010, "Christopher Nolan"),
        Book("1984", 1949, "George Orwell")
    )

    println("--- Stampa dettagli tramite metodo della classe ---")
    for (item in library) {
        item.printDetails()
    }

    println("\n--- Informazioni specifiche per tipo (Parte 5) ---")
    for (item in library) {
        when (item) {
            is Book -> println("Libro - Autore: ${item.author}")
            is Film -> println("Film - Regista: ${item.director}")
        }
    }
}

abstract class Media(var title : String, var year : Int) {

    var rating: Double? = null
        get() {
            if (field == null) {
                println("rating non disponibile")
            }
            return field
        }
        set(value) {
            if (value == null || value in 0.0..10.0) {
                field = value
            } else {
                println("Errore: il rating deve essere compreso tra 0.0 e 10.0")
            }
        }

    constructor(title: String) : this(title, 2000) {

    }
    abstract fun printDetails()
}

class Book(title: String, year: Int, val author: String) : Media(title, year) {
    override fun printDetails() {
        println("Titolo: $title, Anno: $year, Autore: $author")
    }
}

class Film(title: String, year: Int, val director: String) : Media(title, year) {
    override fun printDetails() {
        println("Titolo: $title, Anno: $year, Regista: $director")
    }
}