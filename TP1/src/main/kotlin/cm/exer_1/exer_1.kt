package cm.exer_1

fun main() {
    // alinea a)
    val quadrados_perfeitosA = IntArray(50) { i ->
        val numero = i + 1
        numero * numero
    }

    println(quadrados_perfeitosA.joinToString(" "))

    // alinea b)
    val quadrados_perfeitosB = (1..50).map {
        it * it
    }.toIntArray()

    println(quadrados_perfeitosB.joinToString(" "))

    // alinea c)
    val quadrados_perfeitosC = Array(50) { i ->
        (i + 1) * (i + 1)
    }

    println(quadrados_perfeitosC.joinToString(" "))
}