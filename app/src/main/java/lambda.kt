class User(val username:String, val age:Int, var weapon: Weapon?){
    init {
        println("The user $username was successfully created and he or she is $age years old")
    }
    fun shootFromWeapon(){
        println("$username's just shot from ${weapon?.name}")
    }
}


fun main(args: Array<String>) {
    fun parsingUserData(username: String, age: Int, success: (String, Int)-> User){
        if(username.isNotEmpty()){
            val newUser=success(username, age)
            val awp=Scope("AWP", 135.0, 4750, 4.5)
            newUser.weapon=awp
            newUser.shootFromWeapon()
            awp.makeZoom()
        }else{
            println("ERROR ERROR")
        }
    }
    val user=parsingUserData("John", 16) { username, age -> User(username, age, null) }

}