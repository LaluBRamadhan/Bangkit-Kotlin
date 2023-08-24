class Hewania(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Hewania.getHewaniaInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main(){
    val dicodingCat = Hewania("Miaw",10.0,4,false)
    println(dicodingCat.getHewaniaInfo)

}