/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma
entre A e B e mostre se a soma é menor que C.
*/

fun main() {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var soma: Int = 0

    println("Informe o primeiro valor:")
    a = readln().toInt()
    println("Informe o segundo valor:")
    b = readln().toInt()
    println("Informe o terceiro valor:")
    c = readln().toInt()
    soma = a+b

    println("A soma de $a + $b é igual a: $soma")
    if (soma < c) {
        print("A soma de $a + $b é menor que $c")
    } else {
        print("A soma de $a + $b  não é menor que $c")
    }

}