import java.util.Scanner

fun main() {

    /*
     Kullanıcının girdiği iki sayının toplamını, farkını, çarpımını ve bölümünü
     hesaplayan bir fonksiyonu nasıl yazarsınız?
     */


    val scanner = Scanner(System.`in`)
    println("Sayıları  Giriniz")

    val num1: Int = scanner.nextInt()
    val num2: Int = scanner.nextInt()

    println("İşlemi Giriniz")
    val islem: String = scanner.next().toString()


    calculator(num1, num2, islem)


}

fun calculator(num1: Int, num2: Int, islem: String) {

    when (islem) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> if (num2 != 0) {
            println(num1 / num2)
        }
        else -> println("Geçersiz İşlem")
    }

}