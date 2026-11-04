fun main() {
    print("Inserisci un valore intero: ")
    val input = readln().toInt()
    printTriangle(input)
}

fun printTriangle(input: Int) {
    var counter = 1
    for (row in 1..input) {
    for (i in 1..row) {
        print("*")
    }
    println()
}
}