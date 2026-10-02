fun validarBioInfantil (biografia: String?) {
    val tamanho = biografia?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main () {
    val biografia: String? = "Gosto de  filmes, desenhos e jogos"
    validarBioInfantil(biografia)
}