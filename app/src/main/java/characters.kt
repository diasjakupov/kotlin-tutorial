import java.lang.Exception

class ZeroAttributeException:Exception("You cannot set a negative value into parameters of a character")

class Skill(val name:String, val damage:Double)

abstract class Character(
        val name:String,
        var defSpeed:Double=300.0,
        var defHealth:Double=1000.0,
        var defAttack:Double=50.0,
        private val abilities:Array<Skill>
){
    init{
        if(defSpeed < 0.0 || defHealth < 0.0 || defAttack<0.0 ){
            throw ZeroAttributeException()
        }
        println("Person $name was created")
    }

    private fun getDamage(damage: Double){
        defHealth -= damage
    }

    fun attack(enemy:Character){
        enemy.defHealth -= defAttack
    }

    fun useSpell(idx:Int, to:Character){
        var skillDamage=abilities[idx].damage
        to.getDamage(skillDamage)
    }
}

class Rare(
        name: String,
        defSpeed: Double,
        defAttack: Double,
        defHealth: Double,
        abilities: Array<Skill>
):Character(name, defSpeed, defHealth, defAttack, abilities){
    init {
        this.defHealth += 200.0
        this.defAttack += 50.0
        this.defSpeed += 5.0
    }
}

class Epic(
        name: String,
        defSpeed: Double,
        defAttack: Double,
        defHealth: Double,
        abilities: Array<Skill>
):Character(name, defSpeed, defHealth, defAttack, abilities){
    init {
        this.defHealth += 500.0
        this.defAttack += 100.0
        this.defSpeed += 15.0
    }
}

class Legendary(
        name: String,
        defSpeed: Double,
        defAttack: Double,
        defHealth: Double,
        abilities: Array<Skill>
):Character(name, defSpeed, defHealth, defAttack, abilities){
    init {
        this.defHealth += 1000.0
        this.defAttack += 200.0
        this.defSpeed += 25.0
    }
}




fun main() {
    var phantomAssassin=Epic(
            "Phantom Assassin",
            310.0,
            200.0,
            2100.0,
            arrayOf(Skill("Dagger", 125.0)))
    var axe=Legendary(
            "Axe",
            300.0,
            125.0,
            10000.0,
            arrayOf(Skill("Attack with axe", 125.0)))
    phantomAssassin.attack(axe)
    phantomAssassin.useSpell(0, axe)

}