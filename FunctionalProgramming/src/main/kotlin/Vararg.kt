fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

fun sizeNumbers(vararg number:Int): Int{
    return number.size
}

fun arithNumbers(vararg number:Int): Int{
    var result = 1;
    for(numbers in number){
        result *= numbers
    }
    return result
}

//memasukan array vararg
fun sets(vararg number: Int){
    //return something
}

fun main(){
    val sizeNumber = sizeNumbers(10, 20, 30, 40, 50)
    val sumNumber =sumNumbers(10,20,30,40,50)
    val arithNumber = arithNumbers(1,2,3,4,5)

    //array di vararg
    val number = intArrayOf(10,20,30,40)
    sets(10,20,30,*number,40,50)

    println(sizeNumber)
    println(sumNumber)
    println(arithNumber)

}