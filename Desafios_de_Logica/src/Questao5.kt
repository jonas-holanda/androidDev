/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base
para o Salário mínimo R$ 1.293,20).
*/

fun main() {
    var sal_min_base : Double = 0.0
    var sal_usuario : Double = 0.0

    println("Informe o salário mínimo base:")
    sal_min_base = readln().toDouble()
    println("Informe seu salário:")
    sal_usuario = readln().toDouble()

    println("Você ganha ${String.format("%.2f", sal_usuario/sal_min_base)} salários minímos")
}