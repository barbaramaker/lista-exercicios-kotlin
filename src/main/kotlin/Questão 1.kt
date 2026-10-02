fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor + 20
        null -> valor
        else -> valor
    }
}

fun main() {
    val resultado = calcularDesconto(100.0, "PROMO10")

    println("Valor final: R$ $resultado")
}