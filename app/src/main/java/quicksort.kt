import kotlin.random.Random

fun isGreaterThen(num:Int, mid:Int):Boolean{
    return num > mid
}

fun quicksort(arr:List<Int>): List<Int> {
    return if(arr.size<2){
        arr
    }else{
        var mid=arr[0]
        var leftside=arr.subList(1, arr.size).filter { it<mid }
        var rightside=arr.subList(1, arr.size).filter { isGreaterThen(it, mid) }
        quicksort(leftside)+mid+quicksort(rightside)
    }
}

fun MutableList<Int>.customSum(function:(Int) -> (Boolean)): Int {
    var result= mutableListOf<Int>()
    for(num in this){
        if(function(num)){
            result.add(num)
        }
    }

    return result.sum()
}

fun main() {
    var randomList= mutableListOf<Int>()
    for(i in 1..10){
        randomList.add(Random.nextInt(1000))
    }
    val TestList=(1..10).toMutableList()
    println(TestList.customSum { num->num%2==1 })
    println(quicksort(randomList))
}