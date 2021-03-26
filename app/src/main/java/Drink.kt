import pl.rafalmiskiewicz.R

class Drink(val name: String, val description: String, val imageResourceId: Int) {
    public val drinks = arrayOf(
            { Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczną pianką.", R.drawable.latte) },
            { Drink("Cappuccino", "Czarne espresso z dużą ilością spienonego mlekiem.", R.drawable.cappuccino) },
            { Drink("Espresso", "Kawa ze świżo mielonych ziaren najwuższej jakości.", R.drawable.filter) })
}