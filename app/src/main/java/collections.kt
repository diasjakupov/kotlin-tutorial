import android.os.Build
import androidx.annotation.RequiresApi

fun nestedList(){
    var items= mutableListOf(1..100).flatten()
    var subList= mutableListOf<List<Int>>()
    for(item in 0 until items.size-1 step 10){
        var test2=(items[item]..items[item]+9).toMutableList()
        subList.add(test2)
    }
    for(i in subList){
        println(i)
    }
    println("\n ******************")
}

@RequiresApi(Build.VERSION_CODES.N)
fun dictAnalog(){
    var dictOfOres= hashMapOf("Diamond" to "Very hard", "Gold" to "Hard enough", "Iron" to "Easy to find")

    var getOrDef=dictOfOres.getOrDefault("Red stone", "There is not such ore")

    println("$getOrDef")

    var isContains = dictOfOres.contains("Coal")
    if(!isContains) dictOfOres.put("Coal", "Everywhere")
    println("$dictOfOres")

    var skins= mapOf("Dragon Lore" to "2000$", "RedLine" to "10$", "The Prince" to "1600$")
    for((skin, price) in skins){
        println("$skin costs $price")
    }
    println("\n ******************")

}

fun listOfDict(){
    var list= mutableListOf(hashMapOf("name" to "Dias", "age" to 16, "surname" to "Jakupov"), hashMapOf("name" to "Daniar", "age" to 28, "surname" to "Jakupov"))
    list.forEach{
        println(it["name"].toString().toUpperCase())
    }
}

fun loopsAndTheirAnalogs(){
    var heroes= mutableListOf(
            hashMapOf("name" to "Tony Stark", "abilities" to "rich and rich"),
            hashMapOf("name" to "Thor", "abilities" to "control thunder and flash"),
            hashMapOf("name" to "Doctor Strange", "abilities" to "control reality, magic")
                            )
}

@RequiresApi(Build.VERSION_CODES.N)
fun main(agrs:Array<String>) {
    nestedList()
    dictAnalog()
    listOfDict()
    loopsAndTheirAnalogs()
}