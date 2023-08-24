fun main(){
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    println()
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(100).forEach { print(it) }
}