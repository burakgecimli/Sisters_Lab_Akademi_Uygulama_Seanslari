fun main() {


    //Faktöriyeli bulan bir fonksiyonu nasıl yazarsınız.

    println(fact(5))
    println(fact(7))
    println(fact(8))


}

fun fact(num: Int): Int {

    var fact = 1
    for (i in 1..num) {
        fact *= i
    }

    return fact
}