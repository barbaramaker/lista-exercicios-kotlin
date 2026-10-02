fun auditarEntregas (enderecos: List<String?>) {
    for (endereco in enderecos) {

        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de Dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}
fun main() {
    val enderecos = listOf(
        "Avenida Djalma Batista",
        null,
        "Avenida Constantino Nery",
        null,
        "Avenida Torquato Tapajós"
    )
    auditarEntregas(enderecos)
}