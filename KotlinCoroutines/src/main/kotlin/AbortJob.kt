import kotlinx.coroutines.*

@InternalCoroutinesApi

fun main() = runBlocking {
    val job = launch{
        delay(5000L)
        println("Start new job!")

    }
    delay(2000L)
    job.cancel(cause = CancellationException("Time is up")) //exception untuk memberi tahu kenapa job dibatalkan
    println("Cancelling job...")

    if(job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}