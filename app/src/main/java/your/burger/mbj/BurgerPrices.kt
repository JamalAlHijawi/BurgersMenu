package your.burger.mbj

object BurgerPrices {

    private val prices = mapOf(
        "Cheeseburger" to 15,
        "Chicken burger" to 20,
        "Veggie burger" to 25,
        "Fish burger" to 30
    )

    fun getPrice(burger: String): Int? {
        return prices[burger]
    }
}