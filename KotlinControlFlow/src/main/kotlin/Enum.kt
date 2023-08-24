fun main(){
    Color.RED.printValue()
}

enum class Color{
    RED{
        override fun printValue(){
            println("Red")
        }
    },
    GREEN{
        override fun printValue(){
            println("Green")
        }
    },
    BLUE{
        override fun printValue(){
            println("Blue")
        }
    };

    abstract fun printValue() : Unit
}

