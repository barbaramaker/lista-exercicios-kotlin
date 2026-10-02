fun main() {

    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }

    println("Gorjeta: R$ ${calcularGorjeta(null)}")
    println("Gorjeta: R$ ${calcularGorjeta(15.0)}")
}