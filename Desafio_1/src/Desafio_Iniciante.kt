/*
Desenvolva um programa que solicite ao usuário o tipo de energia
(eletricidade ou gás natural) e o respectivo consumo. Utilize fatores
de emissão específicos para cada tipo de energia: Eletricidade (0.475
kg C02/kWh) e gás natural (2.0 kg C02/m3). O programa deve calcular
a pegada de carbono para cada tipo de energia inserido e, ao final,
apresentar o valor total da pegada de carbono.
 */

import java.util.Scanner

fun calcularConsumo(fator:Double, tipo: String):Double {
    val reader = Scanner(System.`in`)
    var consumo: Double = 0.0

    println("Informe o valor do consumo ($tipo):")
    consumo = reader.nextDouble()

    return consumo * fator
}

fun main() {
    val reader = Scanner(System.`in`)
    val fator_emissao_eletricidade: Double = 0.475
    val fator_emissao_gas: Double = 2.0
    var pegada_eletricidade: Double = 0.0
    var pegada_gas: Double = 0.0
    var total: Double = 0.0
    var menu:Int = -1

    while (menu != 0) {
        println("Digite o número para selecionar a opção desejada:")
        println("1: Valor do Consumo (Eletricidade)")
        println("2: Valor do Consumo (Gás)")
        println("3: Valor total da pegada de Consumo")
        println("0: Sair do Menu")
        menu = reader.nextInt()

        if (menu == 1) {
            pegada_eletricidade = calcularConsumo(fator_emissao_eletricidade, "Eletricidade")
        } else if (menu == 2) {
            pegada_gas = calcularConsumo(fator_emissao_gas, "Gás Natural")
        } else if (menu == 3) {
            total = pegada_gas + pegada_eletricidade
            println("Eletricidade: "+String.format("%.2f", pegada_eletricidade)+ " kg C0₂")
            println("Gás: "+String.format("%.2f", pegada_gas)+ " kg C0₂")
            println("Total: "+String.format("%.2f", total)+ " kg C0₂")
            menu = 0
        } else {
            menu = 0
        }
    }
}