fun main() {
    print("Enter the number: ")
    val input = readlnOrNull()
    try {
        val num = input?.toInt() ?: throw NumberFormatException("Input is null or not a number")
        if (num % 2 == 0) {
            println("$num is even")
        } else {
            println("$num is odd")
        }
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid integer.")
    }
}
