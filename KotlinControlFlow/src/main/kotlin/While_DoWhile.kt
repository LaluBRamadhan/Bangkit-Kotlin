fun main(){
    cobaWhile()
    cobaDoWhile()
}

fun cobaWhile(){
    var counter = 1

    while (counter <= 2){
        println("While")
        counter++
    }
}

fun cobaDoWhile(){
    var counter = 1
    do{
        println("DoWhile")
        counter++
    }while (counter <= 3)
}