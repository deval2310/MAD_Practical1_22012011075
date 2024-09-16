fun main() {
    val a = arrayOf(57, 90, 10, 13, 14)

    // Display the array elements
    for (i in a.indices) {
        println("a[$i]=${a[i]}")
    }

    // Find the largest element
    val largest = a.maxOrNull()

    // Display the largest element
    println("Largest element = $largest")
}
