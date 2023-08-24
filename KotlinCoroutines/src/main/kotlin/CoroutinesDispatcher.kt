import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

////dispatcher default
//launch(Dispatchers.Default){
//    //TODO
//}
//
////dispatcher I/O
//launch(Dispatcher.IO){
//    //TODO
//}



fun main() = runBlocking<Unit>{
    launch(Dispatchers.Unconfined){
        println("Starting in ${Thread.currentThread().name}")
        delay(1000L)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}