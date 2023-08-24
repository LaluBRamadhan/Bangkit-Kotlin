fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if(now > openHours){
        "office is open"
    }else if( now == openHours ){
        "wait a minute, office will be open"
    }else{
        "office is closed"
    }

    println(office)
}