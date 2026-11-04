fun main() {
    print("Inserisci una Stringa: ")
    val input: String = readln()
    printString(input)
}

fun printString(input: String?) {
    when (input) {
        null -> println("")
        else -> println(input)
    }
}