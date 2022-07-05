// variable declaration

const val name = "Top level variable" // variable outside the main function but in the same file
var greeting: String? = null // the greeting variable can be modified to null value

fun main() {
    if (greeting != null){
        println(greeting)
    }else{
        println("Hi, in else..if statement")
    }

    // use if as an expression to assign a value
    val greetingToPrint = if(greeting != null) greeting else "Hi, I am null"
    println(greetingToPrint)

    greeting = "Hello, greeting is not null"
    when (greeting){
        null -> println("Hi")
        else -> println(greeting)
    }

    // use if as an expression to assign a value
    greeting = "Goodbye"
    val greetingToPointWhen = when(greeting){
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPointWhen)


}