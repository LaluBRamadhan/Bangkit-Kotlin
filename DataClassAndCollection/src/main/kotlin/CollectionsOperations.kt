fun main(){
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    /*
    fungsi filter() dan filterNot()
    fungsi tersebut akan menghasilkan list baru dari seleksi
    berdasarkan kondisi yang kita berikan
    */

    //filter()
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)

    //filterNot()
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

    //map()
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    //count()
    println(numberList.count())

    //find()
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull{ it % 2 == 3 }

    println(firstOddNumber)
    println(firstOrNullNumber)

    //first()
    val moreThan10 = numberList.first { it < 5 }
    println(moreThan10)

    //sum()
    val total = numberList.sum()
    println(total)

    //sorted()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

}