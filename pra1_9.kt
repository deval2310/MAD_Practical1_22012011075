fun main() {
    val numbers = ArrayList<Int>()
    print("Enter the number of elements: ")
    val n = readln().toInt()
    print("Enter the elements:\n")
    for (i in 0 until n) {
        numbers.add(readln().toInt())
    }
    val maxNumber = numbers.maxOrNull()
    if (maxNumber != null) {
        println("Largest element = $maxNumber")
    } else {
        println("The list is empty.")
    }
}
