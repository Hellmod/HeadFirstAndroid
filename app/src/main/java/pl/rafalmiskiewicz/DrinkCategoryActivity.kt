package pl.rafalmiskiewicz

import Drink
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DrinkCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_category)

        val listAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            Drink.drinks)

        val listDrinks = findViewById<ListView>(R.id.list_drinks)
        listDrinks.adapter=listAdapter
    }
}