open class Weapon(
        val name: String,
        val damage: Double,
        val price: Int
) {
    init {
        println("You've just created a new type of weapon, which name is $name")
    }
}

class Scope(name:String,damage: Double,price: Int,val maxZoom: Double):Weapon(name, damage, price){
    fun makeZoom(){
        println("Your weapon has $maxZoom zoom value")
    }
}

