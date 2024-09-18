fun main() {
    print("Enter a number: ")
    val number = readln().toInt()
    println("Factorial of $number = ${factorial(number)}")
}
fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}
