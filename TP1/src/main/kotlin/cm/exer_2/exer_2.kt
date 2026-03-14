package org.example.cm.exer_2

import java.util.Scanner

fun main() {
    val leitor = Scanner(System.`in`)

    println("=== CALCULADORA KOTLIN EXERCÍCIO 2 ===")

    try {
        // 1. Entrada de Dados
        print("Digite o primeiro valor (Número ou Booleano): ")
        val entrada1 = leitor.next()

        print("Digite o operador (+, -, *, /, &&, ||, !, shl, shr): ")
        val op = leitor.next()

        // 2. Lógica com Expressão 'when' e Tratamento de Exceções
        val resultado: Any = when (op) {
            "!" -> {
                // Operação unária (apenas um valor)
                !entrada1.toBooleanStrict()
            }
            "+", "-", "*", "/" -> {
                print("Digite o segundo número: ")
                val n1 = entrada1.toDouble()
                val n2 = leitor.nextDouble()

                when (op) {
                    "+" -> n1 + n2
                    "-" -> n1 - n2
                    "*" -> n1 * n2
                    "/" -> {
                        if (n2 == 0.0) throw ArithmeticException("Erro: Divisão por zero!")
                        n1 / n2
                    }
                    else -> throw Exception("Operador aritmético inválido")
                }
            }
            "&&", "||" -> {
                print("Digite o segundo booleano (true/false): ")
                val b1 = entrada1.toBooleanStrict()
                val b2 = leitor.next().toBooleanStrict()
                if (op == "&&") b1 && b2 else b1 || b2
            }
            "shl", "shr" -> {
                print("Digite a quantidade de bits para deslocar: ")
                val n1 = entrada1.toInt()
                val n2 = leitor.nextInt()
                if (op == "shl") n1 shl n2 else n1 shr n2
            }
            else -> throw IllegalArgumentException("Operador '$op' não reconhecido.")
        }

        // 3. Saída com String Templates e Formatação
        println("\n--- RESULTADOS ---")

        when (resultado) {
            is Double -> {
                // Exibe em decimal (2 casas) e hexadecimal (convertendo para Int)
                println("Decimal: ${"%.2f".format(resultado)}")
                println("Hexadecimal: ${resultado.toInt().toString(16).uppercase()}")
            }
            is Int -> {
                println("Decimal: $resultado")
                println("Hexadecimal: ${resultado.toString(16).uppercase()}")
            }
            is Boolean -> {
                println("Resultado Booleano: ${resultado.toString().uppercase()}")
            }
        }

    } catch (e: Exception) {
        // Tratamento Amigável de Erros
        println("\n[ERRO]: ${e.message ?: "Entrada inválida. Verifique os dados digitados."}")
    } finally {
        println("------------------")
        println("Fim da execução.")
    }
}