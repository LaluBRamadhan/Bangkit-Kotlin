import kotlinx.coroutines.*

//menggunakan launch()
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY){
        delay(1000L)
        println("Start new Job!")
    }

    job.start()
    println("Other task!")
}

////menggunakan Job()
//fun main() = runBlocking {
//    val job = Job()
//}