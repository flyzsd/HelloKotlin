package com.shudong.kotlin

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

val f = { x: String -> println(x) }
val f2: (String) -> Unit = { x: String -> println(x) }
typealias PrintString = (String) -> Unit

val f3: PrintString = f
val f4: PrintString = f2