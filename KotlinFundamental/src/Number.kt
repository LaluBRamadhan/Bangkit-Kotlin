fun main(){
    MinMax()
}

fun number1(){
    val iniDouble = 1.3
    val iniFloat = 1.3981293f

    println(
        """
        Double: $iniDouble
        Float: $iniFloat
        """.trimIndent()
    )
}

fun MinMax(){
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(
        """
        maxInt: $maxInt
        minInt: $minInt
        """.trimIndent()
    )

}