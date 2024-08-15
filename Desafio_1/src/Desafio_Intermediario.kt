/*
Desenvolva um programa que solicite ao usuário a distância
percorrida e o meio de transporte utilizado para várias viagens (carro,
ônibus e avião). Utilize fatores de emissão específicos para cada tipo
de veículo: carro (0.21 kg C02/km), ônibus (0.105 kg C02/km), avião
(0.133 kg C02/km). Armazene esses dados em vetores e utilize uma
matriz para acessar os fatores de emissão. Implemente funções que
calculem a pegada de carbono de cada viagem e a soma total. Ao
final, exiba o total da pegada de carbono
 */

import java.util.Scanner

fun calcularPegadaCo2(fator_emissao: Double, matriz: Array<Array<Double>>, menu: Int): Array<Array<Double>> {
    val reader = Scanner(System.`in`)

    println("Informe a distância percorrida do veículo:")
    matriz[menu][0] = reader.nextDouble()
    matriz[menu][1] = matriz[menu][0] * fator_emissao
    println("Valor da Pegada de CO₂: "+String.format("%.2f", matriz[menu][1])+ " kg")
    return matriz
}

fun somatotalPegadaCo2(matriz: Array<Array<Double>>, linhas: Int, colunas: Int) {
    var total: Double = 0.0
    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            if (j == 1) total += matriz[i][j]
        }
    }
    println("O valor total da soma das Pegadas de CO₂ é de: "+String.format("%.2f", total)+ " kg")
}

fun listarPegadasCo2 (matriz: Array<Array<Double>>, linhas: Int, colunas: Int) {
    var veiculo: String = ""
    for (i in 0 until linhas) {
        when (i) {
            0 -> veiculo = "Carro"
            1 -> veiculo = "Ônibus"
            2 -> veiculo = "Avião"
            else -> veiculo = ""
        }
        println("O valor da Pegada de CO₂ do $veiculo é de: ${String.format("%.2f", matriz[i][1])} kg")
    }
}

fun main() {
    val reader = Scanner(System.`in`)
    val linhas: Int = 3
    val colunas: Int = 2
    val fator_emissao_carro: Double = 0.21
    val fator_emissao_onibus: Double = 0.105
    val fator_emissao_aviao = 0.133
    var transportes: Array<Array<Double>> = Array(linhas) { Array(colunas) { 0.0 } }
    var menu: Int = -1

    while (menu != 5) {
        println("Digite o número para selecionar a opção desejada:")
        println("0: Calcular Pegada de CO₂ do Carro")
        println("1: Calcular Pegada de CO₂ do Ônibus")
        println("2: Calcular Pegada de CO₂ do Avião")
        println("3: Soma total das Pegadas de CO₂")
        println("4: Listar todas as Pegadas de CO₂")
        println("5: Sair do Menu")
        menu = reader.nextInt()

        when (menu) {
            0 -> transportes = calcularPegadaCo2(fator_emissao_carro, transportes, menu)
            1 -> transportes = calcularPegadaCo2(fator_emissao_onibus, transportes, menu)
            2 -> transportes = calcularPegadaCo2(fator_emissao_aviao, transportes, menu)
            3 -> somatotalPegadaCo2(transportes, linhas, colunas)
            4 -> listarPegadasCo2(transportes, linhas, colunas)
            5 -> menu = 5
            else -> menu = 5
        }
    }
}