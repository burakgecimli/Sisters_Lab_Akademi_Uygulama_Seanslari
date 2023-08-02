package Soru4

/*
Bir listedeki elemanları tersine çeviren bir fonksiyon yazın.
 */

fun main() {

    val list1 = listOf(3, 5, 1, 7)
    val list2 = listOf(4, 2, 6, 8)
    println(addList(list1, list2))


}

fun addList(list1: List<Int>, list2: List<Int>): List<Int> = (list1 + list2).sorted()
