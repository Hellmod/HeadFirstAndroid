import pl.rafalmiskiewicz.R

class Drink  // Każdy Drink ma nazwę, opis oraz zasób graficzny
private constructor(val name: String, val description: String, val imageResourceId: Int) {

    override fun toString(): String {
        return name
    }

    companion object {
        // drinks to tablica obiektów klasy Drink
        val drinks = arrayOf(
            Drink("Latte",
                "Czarne espresso z gorącym mlekiem i mleczną pianką.",
                R.drawable.latte),
            Drink(
                "Cappuccino",
                "Czarne espresso z dużą ilością spienionego mleka.",
                R.drawable.cappuccino
            ),
            Drink(
                "Espresso",
                "Czarna kawa ze świeżo mielonych ziaren najwyższej jakości.",
                R.drawable.filter
            )
        )
    }
}