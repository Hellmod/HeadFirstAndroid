package pl.rafalmiskiewicz

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView

class FindBeerActivity : Activity() {
    val beerExpert= BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    fun onClickFindBeer(view: View) {
        var brands: TextView = findViewById(R.id.brands)
        var color: Spinner = findViewById(R.id.color)
        var beerType: String = color.selectedItem.toString()
        brands.text = beerExpert.getBrands(beerType).toString()
    }
}