fun main(){
//    Continue()
//    Break()
    BreakContinueLabels()
}

fun Continue(){
    val listOfInt = listOf(1,2,3,null,5,null,7)

    for(i in listOfInt){
        if(i == null) continue
        println("$i")
    }
}

fun Break(){
    val listOfInt = listOf(1,2,3,null,5,null,7)

    for(i in listOfInt){
        if(i == null) break
        println("$i")
    }
}

fun BreakContinueLabels(){
     loop@ for (i in 1..10){
        println("Outside Loop")

        for(j in 1..10){
            println("$j")
            if(j>5) break@loop
        }
    }
}