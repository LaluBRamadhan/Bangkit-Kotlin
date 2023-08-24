class User(val name:String, val age:Int)

data class DataUser(val name:String, val age: Int)

fun main(){
    val user = User("Wahyu",21)
    val dataUser = DataUser("Yoga",22)
    val dataUser2 = DataUser("Yoga",22)
    val dataUser3 = DataUser("Wahyu",23)

    println(user)
    println(dataUser)

    //membandingkan dua DataClass
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    //mengcopy DataUser
    val dataUser4 = dataUser.copy()
    println(dataUser4)

    //mengcopy sekaligun mengedit datanya
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)
}
