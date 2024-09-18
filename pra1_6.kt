fun main() {
    print("Enter the first number: ")
    val num1 = readLine()?.toIntOrNull() ?: return println("Invalid input for the first number.")

    print("Enter the second number: ")
    val num2 = readLine()?.toIntOrNull() ?: return println("Invalid input for the second number.")

    print("Enter the third number: ")
    val num3 = readLine()?.toIntOrNull() ?: return println("Invalid input for the third number.")

    operations(num1, num2, num3)
}

fun operations(num1: Int, num2: Int, num3: Int) {
    val addition = num1 + num2 + num3
    val subtraction = num1 - num2 - num3
    val multiplication = num1 * num2 * num3
    val division = if (num2 != 0) num2 / num1 else "undefined (division by zero)"

    println("Addition of $num1, $num2, $num3 is $addition")
    println("Subtraction of $num1, $num2, $num3 is $subtraction")
    println("Multiplication of $num1, $num2, $num3 is $multiplication")
    println("Division of $num2 by $num1 is $division")
}
