// fun functionName(name:String, age:Int): String{
//     return "Hallo $name, tahun ini kamu berumur ${age.toString()}"
// }

// /*jika kita fungsi yang tidak mengembalikan nilai
// kita bisa pake "unit"

// contoh:
// */
// fun setName(name:String):Unit{
//     print("your name is $name")
// }
// fun main(){
//     println(functionName("Paijo", 12))
//     setName("Lala")
    
// }

//new 

fun main(){
    setUser("Lalu", 21)
    printUser("Ramadhan")
}

fun setUser(name:String, age:Int){
    println("Halo nama kamu $name dengan umur $age")   
}

fun printUser(name:String){
    println("Halo nama kamu $name")
}