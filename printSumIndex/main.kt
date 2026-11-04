fun main() {
    val numbers = mutableListOf<Int?>()
    println("Inserisci valori (scrivi 'null' per valore nullo, 'stop' per terminare):")

    while (true) {
        val input = readln().trim()
        
        if (input.lowercase() == "stop") break

        if (input.lowercase() == "null") {
            numbers.add(null)
        } else {
            val num = input.toIntOrNull()
            if (num != null) {
                numbers.add(num)
            } else {
                println("Valore non riconosciuto, riprova.")
            }
        }
    }
    printIndexSum(numbers)
}

fun printIndexSum(list: List<Int?>) {
    var sum: Int = 0
    for (element in list) {
        if (element != null) {
            sum += element
        }
    }

    println("Somma totale: $sum")
    when (sum) {
        in 51..Int.MAX_VALUE -> println("Altissimo")
        in 41..50            -> println("Alto")
        in 31..40            -> println("Medio")
        in 21..30            -> println("Basso")
        in 10..20            -> println("Bassissimo")
        else                 -> println("Super-Bassissimo")
    }
}