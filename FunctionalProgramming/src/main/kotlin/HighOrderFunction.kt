fun main(){
    //pemanggilan highorderfunction
    printResult(10,sum)
    printRes(20,sum)
}
//HighOrderFunction
fun printResult(value: Int, sum:(Int)->Int){
    val result = sum(value)
    println(result)
}
var sum: (Int) -> Int = { value -> value + value}

//inline function
inline fun printRes(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}