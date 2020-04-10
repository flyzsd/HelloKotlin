package com.shudong.kotlin

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val seq1 = list.asSequence()
    val seq2 = list.asSequence()
    seq1.map { it * 2 }.onEach { println(it) }.sum().also(::println)
    seq1.map { it * 3 }.onEach { println(it) }.sum().also { println("sum = $it") }
    seq2.map { it * 2 }.forEach { println(it) }
}