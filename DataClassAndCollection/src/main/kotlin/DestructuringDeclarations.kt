class Pengguna(val name:String, val age:Int)

data class DataPengguna(val name:String, val age: Int){
    //menerapkan sebuah behaviour
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataPengguna("Lalu",22)
        dataUser.intro()
    //metode 1
    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")

    //metode 2
    val(nama,umur) = dataUser
    println("My name is $nama, I am $umur years old")
}