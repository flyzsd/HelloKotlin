package com.shudong.kotlin

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("hello coroutine")
    println("coroutineScope -> ${this.toString()}")
    val job = launch {
        println("coroutineScope -> ${this.toString()}")
        val mesasge = hello()
        println("message -> $mesasge")
    }
    println("after launch")
//    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
//    delay(2000L)
//    job.join()
}

suspend fun hello(): String {
    delay(1000L)
    return coroutineScope<String> {
        println("hello inside coroutine")
        println("coroutineScope -> ${this.toString()}")
        "new coroutineScope"
    }
}