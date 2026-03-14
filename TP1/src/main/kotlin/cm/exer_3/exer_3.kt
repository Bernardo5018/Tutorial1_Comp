package cm.exer_3

import java.util.Locale

fun main() {
    // Gerar a sequência de alturas dos saltos, começa com 100 metros e reduz 60% a cada salto
    val alturas = generateSequence(100.0 * 0.6) { alturaAnterior ->
        alturaAnterior * 0.6
    }
        // Filtrar para manter apenas saltos que atingem pelo menos 1 metro de altura
        .filter { it >= 1.0 }
        // Pegar os primeiros 15 saltos que atendem ao critério
        .take(15)
        // Converter para uma lista
        .toList()

    // Imprimir as alturas dos saltos, formatadas com 2 casas decimais
    println("Alturas dos saltos:")
    println(alturas.joinToString(", ") { String.format(Locale.US, "%.2f", it) })
}