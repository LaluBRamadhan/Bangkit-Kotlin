class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
) {

    fun eat(){
        println("$name can eat")
    }

    fun sleep(){
        println("$name can sleep")
    }
}

fun main(){
    val Elang = Animal("Elang",60.0, 10,)

    Elang.eat()
    Elang.sleep()
}