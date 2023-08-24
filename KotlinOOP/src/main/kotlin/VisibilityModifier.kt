
//open digunakan untuk memberikan akses untuk diwariskan kepada kelas yang lain
open class Manusia(private val name:String, private val weight: Double, private val age:Int){
    fun getName():String{
        return name
    }

    fun getWeight():Double{
        return weight
    }

    fun getAge(): Int{
        return age
    }

    fun setName(){
        this.name
    }

    fun setWeight(){
        this.weight
    }

    fun setAge(){
        this.age
    }
}

fun main(){
    val people = Manusia("Lalu", 65.0, 21)
    println("""
        Nama : ${people.getName()}
        Berat: ${people.getWeight()}
        Umur : ${people.getAge()}
    """.trimIndent())
}