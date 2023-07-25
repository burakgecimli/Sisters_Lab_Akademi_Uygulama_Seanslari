import java.util.Scanner

fun main() {

    /*
        Sayının asal olup olmadığını kontrol eden bir fonksiyonu nasıl yazarsınız?
     */

    val scanner = Scanner(System.`in`)

    println("Sayı Giriniz")
    val num = scanner.nextInt()

    if (asalMi(num)) {
        println("$num sayısı Asal Sayıdır")

    } else {
        println("$num sayısı Asal Sayı Değildir")
    }


}

fun asalMi(num: Int): Boolean {

    var result = true //Asal

    if (num < 2) {
        result = false
    }

    for (i in 2..num / 2) {
        if (num % i == 0) {
            result = false //Asal değil
        }
    }
    return result
}