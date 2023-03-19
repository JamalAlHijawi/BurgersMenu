package your.burger.mbj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var burgerSpinner: Spinner
    private lateinit var priceButton: Button
    private lateinit var priceTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        burgerSpinner = findViewById(R.id.burger_spinner)
        priceButton = findViewById(R.id.price_button)
        priceTextView = findViewById(R.id.price_textview)

        priceButton.setOnClickListener {
            val selectedBurger = burgerSpinner.selectedItem.toString()
            val price = BurgerPrices.getPrice(selectedBurger)
            if (price != null) {
                priceTextView.text = "$$price"
            } else {
                priceTextView.text = "Price not found"
            }
        }
    }
}
