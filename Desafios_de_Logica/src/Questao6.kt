/*
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
*/

fun main() {
    var num: Double = 0.0

    println("informe um número:")
    num = readln().toDouble()

    println("O número $num com um acréscimo de 5% passa a ser: ${String.format("%.2f",num * 1.05)}")
}