package com.shudong.kotlin

data class Port(var value: Int = 0, var isSecure: Boolean = false) {
    operator fun invoke(function: Port.() -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

data class Configuration(var host: String = "", var port: Port = Port()) {
    operator fun invoke(function: Configuration.() -> Unit) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main() {
    val config = Configuration()
    config {
        host = "127.0.0.1"
        port {
            value = 8848
            isSecure = true
        }
    }
}