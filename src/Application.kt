fun main() {
    println("hello world!")
    numbers()
    string()
    letUsLoop()
}

fun numbers() {
    val number1 = 123
    val number2 = 0x0001_03EF
    val number3 = 0b1011
    val oneMillion = 1_000_000
    val number4: Int? = 456
    val number5 = number3.toInt()
    val char1 = 'a'
    val char2 = '\uFF00';
    var string2 = "😇"

    if (number3 in number1..number2) {
    }

    for (element in string2) {
        println(element.toInt())
    }
}

fun array() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOfNulls<Int>(5)
    val array3 = Array(5) { it.toString() }
    val array4 = intArrayOf(4, 5, 6)
    val array5 = IntArray(10) { it }
    val array6 = LongArray(7)
    val array7 = ByteArray(10)
    for ((index, value) in array1.withIndex()) {
        println("the element at $index is $value")
    }
}

fun string() {
    val text1 = """
    for (c in "foo")
        print(c)
    """.trimIndent()

    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text1)

    val s = "abc"
    println("$s.length is ${s.length}")
}

fun maxOfTwo(a: Int, b: Int) {
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun hasPrefix(x: Any): Unit = when (x) {
    1, 2 -> println("is 1 or 2")
    in 3 until 10 -> println("in 3 until 10")
    !in 20..100 -> println("not in 20..100")
    is String -> println("is String")
    !is Int -> println("is not Int")
    else -> println("else")
}

class Person {
    val age by lazy { 20 }
    val name: String
        get() {
            return "hello"
        }
    val count: UInt = 5u

    fun print(name: String) {
        println(name)
    }
}

fun letUsLoop() {
    for (i in 0..10) {
        println(i)
    }

    for (i in 0 until 10) {
        println(i)
    }

    repeat(10) {
        println(it)
    }

    (1..10).forEach { println(it) }
}