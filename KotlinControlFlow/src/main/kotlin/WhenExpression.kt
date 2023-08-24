import kotlin.random.Random

fun main(){
//    whenSatu()
//    whenDua()
//    whenTiga()
//    whenEmpat()
    whenLima()
}

fun whenSatu(){
    val value = 20

    when(value){
        1 -> println("Value is 1")
        2 -> println("Value is 2")
        3 -> println("Value is 3")
        else -> println("Value is invalid")
    }
}

fun whenDua(){
    val value = 7

    val stringOfValue = when(value){
        6 -> {
            println("Angka 6")
            "Value is 6"
        }
        7 ->{
            println("Angka 7")
            "Value is 7"
        }
        8 -> {
            println("Angka 8")
            "Value is 8"
        }
        else -> {
            println("Value is invalid")
            "number exist"
        }
    }
}

fun whenTiga(){
    val anyType: Any = 1000L

    when(anyType){
        is Long -> println("the value has a Long Type")

        is String -> println("the value has a String type")

        else -> println("Undefined")
    }
}

fun whenEmpat(){
    val value = 25
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is out of the range")
        else -> println("Value undefined")
    }
}

fun whenLima(){
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)