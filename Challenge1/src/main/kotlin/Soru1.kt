import java.util.Scanner

fun main(args: Array<String>) {


//    Kullanıcıdan isim ve yaş bilgisini girmesini isteyen bir programı nasıl yazarsınız?

    val scanner = Scanner(System.`in`)
    println("İsminizi Giriniz")
    val name = scanner.next()

    println("Yaşınızı Giriniz")
    val age = scanner.nextInt()

    println("İsminiz:$name Yaşınız:$age")


}