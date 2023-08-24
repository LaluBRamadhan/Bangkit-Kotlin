fun main(){
//    loopWithIndex()
//    forEach()
//    forEachInedexed()
    forEachIndexOnly()
}

fun loopWithIndex(){
    val ranges = 1.rangeTo(10) step 3
    for ((index,value) in ranges.withIndex()){
        println("value $value with index $index")
    }
}

fun forEach(){
    val ranges = 1.rangeTo(10) step 2
    ranges.forEach{value->
        println("value is $value")
    }
}

fun forEachInedexed(){
    val ranges = 1.rangeTo(10) step 2
    ranges.forEachIndexed{ index: Int, i: Int ->
        println("value $i with index $index")
    }
}

fun forEachIndexOnly(){
    val ranges = 1.rangeTo(10)
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}