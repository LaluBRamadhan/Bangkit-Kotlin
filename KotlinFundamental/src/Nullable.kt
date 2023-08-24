fun main(){
    // val text: String = null //compile time error
    val text: String? = null //ini bisa
    println(text)
    
    /*mengakses atau mengelola nilai dari objek
    yang sudah kita tandai sebagai nullable*/
    // val textLength = text.length //compile time error

    /*ketika ingin mengakses objek yang kita tandai sebagai nullable
    maka kita harus cek objek dulu apakah null atau tidak
    berikut caranya : */

    if(text != null){
        val textLength = text.length
        println(textLength)
    }


}