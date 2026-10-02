fun verificarEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Aviso: conta inválida será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }
    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val emails = listOf(
        "barbara@gmail.com",
        null,
        "",
        "aluno@uninorte.com",
        null
    )
    verificarEmails(emails)
}