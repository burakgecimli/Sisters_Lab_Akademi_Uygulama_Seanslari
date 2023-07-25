import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Sayıyı giriniz:")

    try {
        val num = scanner.nextInt()
        val ondalikliSayi = num.toDouble()
        println("Ondalıklı Sayı: $ondalikliSayi")
    } catch (e: Exception) {
        println("Geçersiz Sayı Girdiniz.")
    }
}
