fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Dehli" to "India",
    )

    //akses metode 1
    println(capital["Jakarta"])

    //akses metode 2
    println(capital.getValue("London"))

    //menampilkan key apa saja yang ada di dalam map
    val mapKeys = capital.keys
    println(mapKeys)

    //menampilkan values apa saja yang ada di dalam map
    val mapValue = capital.values
    println(mapValue)

    //mengubah map menjadi muttable
    val mutableCapital = capital.toMutableMap()

    //menambahkan key value
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}