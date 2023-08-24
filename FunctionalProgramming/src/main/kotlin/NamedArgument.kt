fun userData(first:String, middle:Int, last:Int): String{
    return "$first $middle $last"
}

fun main(){
    val user = userData(first = "Kotlin", middle = 20, last = 1000000)
    println(user)
}