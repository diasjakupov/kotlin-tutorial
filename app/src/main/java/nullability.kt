fun main(agrs:Array<String>) {
    var name:String?="Dias"
    name=null

    //First way to avoid the NPE
    var length=if (name != null) name.length else -1
    println(length)

    //Second way
    println(name?.length)

    //Third way
    var length2=name?.length ?: -1
    println(length2)

    //!!-cause the NPE
    //println(name!!.length)
}