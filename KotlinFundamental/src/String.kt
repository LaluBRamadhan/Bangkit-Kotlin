fun main(){
    val text: String = "Hello World!"
    val firstChar = text[0] //mengakses index pertama dari text

    println("Karakter pertama dari teks $text adalah $firstChar")

    //iterasi setiap karater dalam variabel text

    for(char in text){
        print("$char  ")
    }

    println()

    //escaped string
    //contoh
    val str = "Hello \"World\"!"
    println(str)

    //menambahkan unicode kedalam string
    val str2 = "Hello \uD83D\uDC4D World!"
    println(str2)


    //raw string
    //contoh
    val str3 = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(str3)
}


