fun main(){
    //deklarasi set
    val setA = setOf(1,2,3,4,2,1,5)
    val setB = setOf(1,2,3,4,5)
    println(setA)

    /*
    pengecekan apakah sebuah nilai
    ada di dalam Set dengan menggunakan kata kunci in
    */
    println(5 in setA)

    //fungsi union dan intersect
    val setC = setOf(1,5,7,3)
    val union = setA.union(setC)
    val intesect = setA.intersect(setC)

    println(union)
    println(intesect)
}