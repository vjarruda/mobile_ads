package com.example.mobile.atividade1

//1
fun maiorNumero(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}

//2
data class Produto(val nome: String, var preco: Double, val categoria: String) {
    fun desconto(porcento: Double) {
        val desconto = preco * (porcento / 100)
        preco -= desconto
    }
}

//4
fun String.interteETrocaVogal(): String {
    val invertido = this.reversed()
    return invertido.replace(Regex("[aeiouAEIOU]"), "*")
}

fun main() {
    //1 - uso
    println(maiorNumero(6, 1, 9))

    println("-----------------------------------------")
    //2 - uso
    val p = Produto("Placa de Video", 3000.0, "Eletronico")
    p.desconto(5.0)
    println(p)

    println("-----------------------------------------")
    //3
    val nomes = listOf("vinicius", "Anna", "amanda", "Joao", "Armando")
    val nomesFiltrados = nomes.filter { it.length > 3 && it.startsWith("a", ignoreCase = true) }
        .map { it.uppercase() }

    println(nomesFiltrados)

    println("-----------------------------------------")
    //4 - uso
    val texto = "Vinicius Arruda"
    println(texto.interteETrocaVogal())
}
