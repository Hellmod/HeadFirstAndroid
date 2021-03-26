package pl.rafalmiskiewicz

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DrinkActivity : Activity() {
    companion object {
        const val EXTRA_DRINKID = "drinkId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)
        val drinkId = intent.getIntExtra(EXTRA_DRINKID, 0)
        val drink = Drink.drinks[drinkId]

        val name = findViewById<TextView>(R.id.name)
        name.text = drink.name

        val description = findViewById<TextView>(R.id.description)
        description.text = drink.description

        val photo = findViewById<ImageView>(R.id.photo)
        photo.setImageResource(drink.imageResourceId)
        photo.contentDescription = drink.name
    }
}