fun main(){
    val value: Int? = null
    println(value.slice)
}

// jika value berupa null maka akan diassign default value
//sebesar 5

//namun jika bukan null maka akan dilakukan operasi div
val Int?.slice
    get() = this?.div(2) ?: 5