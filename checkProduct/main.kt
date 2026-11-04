data class Product(val name: String, val price: Double, val quantity: Int)

fun main() {
    val products = listOf(
        Product(name = "Laptop", price = 999.99, quantity = 5),
        Product(name = "iPhone 50", price = 2999.0, quantity = 2),
        Product(name = "TV", price = 450.0, quantity = 10), 
        Product(name = "Tastiera Wireless Meccanica RGB Ultra Pro", price = 129.99, quantity = 7), 
        Product(name = "Mouse", price = 25.50, quantity = 15)
    )

    for (product in products) {
        var output = "Prodotto: ${product.name}, Prezzo: €${product.price}, Quantità: ${product.quantity}"

        if (product.name == "iPhone 50") {
            output += " - mmm, sospetto"
        }
        when {
            product.name.length < 3 -> output += " (nome troppo corto)"
            product.name.length > 20 -> output += " (nome troppo lungo)"
        }

        println(output)
    }
}