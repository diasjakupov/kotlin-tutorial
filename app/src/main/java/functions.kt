fun createSpell(val1:String, val2:String):String{
    return "Your spell contains two components.These are $val1 and $val2"
}

fun main(agrs: Array<String>) {
    println(createSpell("Air", "Fire"))
}