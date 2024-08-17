/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média
das notas.
*/

fun main() {
    var notas: Array<Double> = Array(3) {0.0}
    var soma: Double = 0.0
    var media: Double = 0.0

    for (i in 0 until notas.size) {
        println("Informe a nota ${i+1}:")
        notas[i] = readln().toDouble()
    }

    for (i in 0 until notas.size) {
        soma += notas[i]
    }

    media = soma/notas.size
    println("A média das notas é: ${String.format("%.2f", media)}")
}