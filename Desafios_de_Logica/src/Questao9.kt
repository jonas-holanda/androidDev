/*
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o
seu peso e sua altura e imprima na tela sua condição de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC
Abaixo de 18,5 | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida)
*/

fun main() {
    var peso: Double = 0.0
    var altura: Double = 0.0
    var imc: Double = 0.0

    println("Informe seu peso:")
    peso = readln().toDouble()
    println("Informe sua altura:")
    altura = readln().toDouble()
    imc = peso / (altura * altura)
    println("imc $imc")
    if (imc < 18.5) {
        println("Abaixo do peso")
    } else if (imc <= 24.9) {
        println("Peso ideal (parabéns)")
    } else if (imc <= 29.9) {
        println("Levemente acima do peso")
    } else if (imc <= 34.9) {
        println("Obesidade grau I")
    } else if (imc <= 39.9) {
        println("Obesidade grau II (severa)")
    } else {
        println("Obesidade grau III (mórbida)")
    }
}