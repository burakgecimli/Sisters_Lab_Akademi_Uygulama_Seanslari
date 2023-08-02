package Soru6


fun main() {

    /*
    Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın
     */

    val hash = hashSetOf<Int>(1, 2, 3, 4, 5)
    println(addHashSet(hash))


}

fun addHashSet(set: HashSet<Int>): HashSet<Int> {
    val newSet = HashSet<Int>()
    newSet.addAll(set)
    return newSet

}