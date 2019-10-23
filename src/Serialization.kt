import kotlin.system.measureTimeMillis

data class Customer(val name: String, val age: Int)

fun Customer.hello(message: String) {
    require(message.length > 2) { "message is too short - ${message.length}" }
    check(message.length > 2) { "message is too short - ${message.length}" }
    assert(message.length > 2) { "message is too short - ${message.length}" }
    println("$name $message")
}

fun main() {
    val time = measureTimeMillis {
        val customer = Customer("Jeffrey", 6)
        customer.hello("shudong")
    }
    println("time spent $time ms")
}

class Test : Runnable {
    override fun run() {
        TODO("not implemented")
    }
}