package pl.rafalmiskiewicz

import Drink
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DrinkCategoryActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_category)

        val listAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            Drink.drinks
        )

        val listDrinks = findViewById<ListView>(R.id.list_drinks)
        listDrinks.adapter = listAdapter
        listDrinks.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DrinkActivity::class.java)
            intent.putExtra(DrinkActivity.EXTRA_DRINKID, id)
            startActivity(intent)
        }
    }
}