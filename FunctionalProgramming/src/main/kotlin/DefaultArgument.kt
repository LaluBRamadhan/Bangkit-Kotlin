fun main(){
    val fullname = getFullName()
    println(fullname)
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome",
) : String{
    return "$first $middle $last"
}