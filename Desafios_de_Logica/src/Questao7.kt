/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são
VERDADEIRO ou FALSO.
*/

fun main() {
    var b1: Boolean = false
    var b2: Boolean = false

    println("Informe um valor lógico (true ou false):")
    b1 = readln().toBoolean()
    println("Informe um valor lógico (true ou false):")
    b2 = readln().toBoolean()

    if (b1 && b2) {
        println("Ambos os valores informados são Verdadeiros.")
    } else if (b1 == b2) {
        println("Ambos os valores informados são Falsos.")
    } else {
        println("Os valores informados são diferentes.")
    }
}