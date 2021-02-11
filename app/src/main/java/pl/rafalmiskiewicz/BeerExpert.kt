package pl.rafalmiskiewicz

class BeerExpert {
    fun getBrands(color:String):ArrayList<String>{
        return when(color){
            "jasne"-> arrayListOf("Jail Pale Ale","Gout Stoit")
            "bursztynowe"-> arrayListOf("Jack Amber","Red Moose")
            "brązowe"-> arrayListOf("Tyskie","Harnaś")
            "ciemne"-> arrayListOf("Dębowe Mocne","Książęce")
            else -> arrayListOf()
        }
    }
}