fun main(){
    SafeCalls()
    ElvisOperator()
    // NonNullAssertion()
}

fun SafeCalls(){
    val text:String? = null
    text?.length
}

fun ElvisOperator(){
    val text:String? = null
    val textLength = text?.length ?: 7

    println(textLength)
    //kode diatas sama saja artinya dengan kode dibawah:
    // val textlength = if(text!=null) text.length else 7
}

fun NonNullAssertion(){
    val text:String? = null
    val textLength = text!!.length
    println(textLength)
}