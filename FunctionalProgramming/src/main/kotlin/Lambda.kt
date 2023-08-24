
//lambda expression
val comparator = Runnable{
    //TODO
}

//menggunakan lambda expression
/*
kode dibawah adalah lambda expression
karena dia dibungkus dengan kurung kurawal
 */
val message = { println("Hello World") }

/*
menambahkan parameter pada fungsi lambda
sebagai berikut
 */
val printMessage = { message:String -> println(message)}

/*
fungsi lain yang kita bisa gunakan dalam
lambda function sebagai berikut
 */
val messageLength = { message:String -> message.length}

fun main(){
    message()
    printMessage("Kotlin is Awesome")
    val length = messageLength("Hello World");
    println("panjang pesan $length")

}
