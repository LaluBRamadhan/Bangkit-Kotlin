fun main(){
    val officeOpen = 7
    val officeClosed = 16

    val now = 12

    val isOpen = if(now >= officeOpen && now <= officeClosed){
        true
    } else{
        false
    }

    println("office is open : $isOpen")

    val bioskopBuka = 7
    val waktuSekarang = 16

    val isBuka = waktuSekarang > bioskopBuka

    if(!isBuka) println("Bioskop masih tutup")
    if(isBuka) println("Bioskop sudah Buka")
    
}