package Soru3

fun main() {

     /*
    Bir listedeki elemanları tersine çeviren bir fonksiyon yazın.
    */

    val list1 = listOf(3, 5, 1, 7)
    println(reverseList(list1))

}

fun reverseList(list1: List<Int>) = list1.reversed()

