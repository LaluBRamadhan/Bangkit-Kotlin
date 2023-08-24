//in constructor we can assign default value in it
class hewanian(name:String, weight: Double = 0.0, age: Int = 0){ //main or primary constructor
    //assign default value so it can called default instructor
//    val name: String = "Hewan"
//    val weight: Double = 0.1
//    val age : Int = 1
//    var isMammal : Boolean = false

    val name: String
    val weight: Double
    val age : Int
    var isMammal: Boolean

    init {
        this.name = name
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.isMammal = false
    }

    //secondary constructor
    constructor(name: String, weight: Double, age: Int,isMammal: Boolean) : this(name,weight,age){
        this.isMammal = isMammal
    }
}

fun main(){
    val animal = hewanian("Elang", 60.0, 12, false)
    println("Nama : ${animal.name}, Berat : ${animal.weight}, Umur : ${animal.age}, isMamal : ${animal.isMammal}")
}