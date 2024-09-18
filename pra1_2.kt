fun main() {
    print("Enter an integer value: ")
    val intValue: Int = readln().toInt()
    val doubleValue: Double = intValue.toDouble()
    println("Double Value (From Integer): $doubleValue")

    print("Enter a string value representing an integer: ")
    val stringValue: String = readln()
    val intValueFromString: Int = stringValue.toInt()
    println("Integer Value (From String): $intValueFromString")

    print("Enter a string value representing a double: ")
    val doubleStringValue: String = readln()
    val doubleValueFromString: Double = doubleStringValue.toDouble()
    println("Double Value (From String): $doubleValueFromString")
}
