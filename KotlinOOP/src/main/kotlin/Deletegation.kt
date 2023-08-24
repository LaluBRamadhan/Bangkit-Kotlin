import kotlin.reflect.KProperty

// fungsi untuk mengatur atau mengelola getter dan setter
class DelegateName{
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue:Any){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Hewan(){
    var name:Any by DelegateName()
    var weight: Any by DelegateName()
    var age: Any by DelegateName()
}


fun main(){
    val animal = Hewan()
    animal.name = "Miaw"
    animal.weight = 60.2
    animal.age = 23
    println(animal.name)
    println(animal.weight)
    println(animal.age)
}