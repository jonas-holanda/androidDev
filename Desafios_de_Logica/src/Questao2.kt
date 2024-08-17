/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é
par ou ímpar, positivo ou negativo.
*/

fun main() {
    var num: Int = 0
    var mod: Int = 0

    println("Informe um número")
    num = readln().toInt()
    mod = num % 2

    if (num < 0) {
        when (mod) {
            0 -> println("O número $num é par e negativo")
            -1 -> println("O número $num é ímpar e negativo")
        }
    } else {
        when (mod) {
            0 -> println("O número $num é par e positivo")
            1 -> println("O número $num é ímpar e positivo")
        }
    }

}