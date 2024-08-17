/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o
seu sucessor.
*/

fun main() {
    var num: Int = 0

    println("Informe um número inteiro:")
    num = readln().toInt()

    println("O antecessor de $num é ${num-1}.")
    println("o sucessor de $num é ${num+1}.")

}