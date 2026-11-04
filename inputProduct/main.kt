data class Product(val name: String, val price: Double, val quantity: Int)

fun createProduct(name: String?, price: Double?, quantity: Int?): Product? {
    return if (name != null && price != null && quantity != null) {
        Product(name, price, quantity)
    } else {
        null
    }
}

fun main() {
    val products = mutableListOf<Product>()

    val product1 = createProduct("Monitor", 349.99, 8)
    if (product1 != null) {
        products.add(product1)
    }

    val product2 = createProduct("Cuffie", null, 15)
    if (product2 != null) {
        products.add(product2)
    }
    createProduct("Webcam", 49.90, 20)?.let { products.add(it) }

    println("Prodotti inseriti nell'elenco:")
    for (p in products) {
        println("- ${p.name}: €${p.price} (Quantità: ${p.quantity})")
    }
}