fun main(){
    val numberList0 : List<Int> = listOf(1,2,3,4,5)
    //atau, karena kompiler sudah tau tipe data tanpa di tentukan secara explisit
    val numberList = listOf(1,2,3,4,5)
    val charList = listOf('a','b','c')

    val anyList = listOf('a',"Kotlin",55,true)

    //list diatas tidak dapat diubah

    //jika ingin merubah list gunakan sebagai berikut
    val allList = mutableListOf(1,2,3,true,"Dart",'Z',false)

    //fungsi-fungsi manipulasi dibawah
    allList.add('d') // menambah item di akhir list
    allList.add(1, "love") // menambah item pada indeks ke-1
    allList[3] = false // mengubah nilai item pada indeks ke-3
    allList.removeAt(0) // menghapus item pada indeks ke-0

}