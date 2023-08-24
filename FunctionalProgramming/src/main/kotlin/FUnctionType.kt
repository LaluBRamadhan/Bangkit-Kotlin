//typealias
typealias arithmetic = ((Int, Int) -> Int)?

fun main(){
    val sum: arithmetic = {valueA, valueB -> valueA + valueB}
    val mul: arithmetic = {valueA, valueB -> valueA * valueB}

    val sumResult = sum?.invoke(10,5)
    val mulResult = mul?.invoke(10,2)

    println(sumResult)
    println(mulResult)
}