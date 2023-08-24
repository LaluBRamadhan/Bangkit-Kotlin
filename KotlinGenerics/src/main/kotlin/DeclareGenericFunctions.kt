import List


public fun <T> List<T>.slice(indices: Iterable<Int>): List<T>{
    return this
}

fun main(){
    val numbers = (1..1000000).toList()
    print(numbers.slice<Int>(1..999999))
}
