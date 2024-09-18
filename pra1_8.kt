fun main() {
    val array = intArrayOf(51, 23, 72, 19, 75)
    println("Array before sorting : ${array.joinToString()}")
    bubbleSort(array)
    println("Array after sorting : ${array.joinToString()}")
}

fun bubbleSort(array: IntArray) {
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
