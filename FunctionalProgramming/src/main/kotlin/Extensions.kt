fun main(){
    10.printInt()
    println(30.plusThree())
    println(10.slice)
}

//extension function
fun Int.printInt(){
    println("value $this")
}

fun Int.plusThree(): Int{
    return this + 3
}


//extension properties
val Int.slice: Int
    get() = this / 2