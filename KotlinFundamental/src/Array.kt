fun main(){
    ArrayMix()
}

fun DeklarasiArray(){
    val array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for(i in array){
        println(i)
    }
}

fun ArrayMix(){

    val mixArray = arrayOf(1,2,3,4,5, "Hello", true)
    mixArray[4] = 10
    for(i in mixArray){
        println(i)
    }
}