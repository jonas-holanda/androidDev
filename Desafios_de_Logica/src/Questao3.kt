/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de
qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor
na tela.
*/
fun main() {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0

    println("Informe o primeiro número:")
    a = readln().toInt()
    println("Informe o segundo número:")
    b = readln().toInt()

    if (a == b) {
        c = a+b
        println("o resultado da soma dos dois números é: $c")
    } else {
        c = a*b
        println("o resultado da multiplicação dos dois números é: $c")
    }


}