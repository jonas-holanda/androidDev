/*
8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores
em ordem decrescente.
*/

fun main() {
    var nums: Array<Int> =Array(3) { 0 }

    for (i in 0 until nums.size) {
        println("Informe um valor inteiro: ")
        nums[i] = readln().toInt()
    }

    print("Valores informados: ")
    for (i in 0 until nums.size) {
        print("${nums[i]} ")
    }

    nums = ordemDecrescente(nums)
    println()
    print("Valores em ordem decrescente: ")
    for (i in 0 until nums.size) {
        print("${nums[i]} ")
    }

    nums = ordemCrescente(nums)
    println()
    print("Valores em ordem crescente: ")
    for (i in 0 until nums.size) {
        print("${nums[i]} ")
    }

}

fun ordemDecrescente(nums: Array<Int>): Array<Int> {
    for (atual in 0 until nums.size) {
        for (proximo in atual+1 until nums.size) {
            if (nums[atual] < nums[proximo]) {
                val aux = nums[atual]
                nums[atual] = nums[proximo]
                nums[proximo] = aux
            }
        }
    }
    return nums
}

fun ordemCrescente(nums: Array<Int>): Array<Int> {
    for (atual in 0 until nums.size) {
        for (proximo in atual+1 until nums.size) {
            if (nums[atual] > nums[proximo]) {
                val aux = nums[atual]
                nums[atual] = nums[proximo]
                nums[proximo] = aux
            }
        }
    }
    return nums
}