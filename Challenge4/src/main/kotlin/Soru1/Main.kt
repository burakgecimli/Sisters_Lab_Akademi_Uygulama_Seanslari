package Soru1

/*
 Verilen iki HashMap'in kesişimini bulan bir fonksiyon yazın.
 */

fun main() {
    // iki HashMap oluşturun
    val map1 = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    val map2 = hashMapOf("b" to 4, "c" to 5, "d" to 6)
    // kesişen anahtarları bulun
    val keys = kesisimBul(map1, map2)
    // kesişen anahtarları ekrana yazdırın
    println(keys)

}


fun kesisimBul(hashMap1: HashMap<String, Int>, hashMap2: HashMap<String, Int>): Set<String> {

    val keys = hashMap1.keys.toMutableSet()

    keys.retainAll(hashMap2.keys)

    return keys
}