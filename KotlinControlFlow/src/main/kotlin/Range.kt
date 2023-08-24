fun main(){
    val rangeInt = 1 .. 10 step 3
    rangeInt.forEach{element ->
       println("$element")
    }

    fungsiRangeTo()
}

fun fungsiRangeTo(){
    val rangeInt = 1.rangeTo(10)
    for(i in rangeInt){
        println(i)
    }
}