class hewan{
    var name: String = "Meow"
        get(){
            println("Fungsi Getter dipanggil")
            return field
        }

        set(value){
            println("Fungsi Setter dipanggil")
            field = value
        }
}

fun main(){
    val Cat = hewan()
    println(Cat.name)
    Cat.name = "Goose"
    println(Cat.name)

}