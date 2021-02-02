
fun main(args: Array<String>)
{
    var str="My first kotlin project"
    val input= readLine()!!
    val contentEquals=str.contentEquals(input)
    println(contentEquals) /*if initial str equals to another*/

    print("Set start index: ")
    val start= readLine()!!.toInt()
    print("Set end index: ")
    val end= readLine()!!.toInt()
    val subString=str.subSequence(startIndex = start, endIndex = end)
    println(subString)/*get slice by start and end indexes*/

    val firstName="Dias"
    val age=10
    val nickName="Fake"
    print("My name is $firstName and I'm $age years old.My nickname is $nickName")
}

