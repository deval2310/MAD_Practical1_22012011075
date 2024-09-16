class Car(
    private val make: String,
    private val year: Int,
    private val owner: String,
    private var milesDriven: Int,
    private val originalPrice: Double
) {
    private var currentPrice: Double = originalPrice

    init {
        calculateCurrentPrice()
    }

    private fun calculateCurrentPrice() {
        val depreciation = milesDriven * 0.1 // 10 cents per mile driven
        currentPrice = originalPrice - depreciation
        if (currentPrice < 0) currentPrice = 0.0
    }

    fun displayInformation() {
        println("Car Information: $make, $year")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: $currentPrice")
        println("----------")
    }
}

fun main() {
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0)
    car1.displayInformation()

    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0)
    car2.displayInformation()

    println("******* ArrayList of Car ***********")
    val carList = arrayListOf(
        Car("Toyota", 2017, "KJS", 100, 1000000.0),
        Car("Maruti", 2020, "NPP", 200, 4000000.0)
    )

    carList.forEach { it.displayInformation() }
}