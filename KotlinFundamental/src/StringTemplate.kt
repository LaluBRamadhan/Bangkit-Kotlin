fun main(){
    StringTemplate()
}

fun StringTemplate(){
    val umur = 21
    println("Anda berumur $umur tahun")

    println("Kamu berumur $umur, maka ${if(umur <17) "kamu tidak punya SIM" else "Kamu punya SIM"}")
}