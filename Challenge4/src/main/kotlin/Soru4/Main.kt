package Soru4

fun main() {

    /*
    Bir HashMap'teki en büyük değeri ve anahtarını bulan bir fonksiyon yazın.
     */

    val hashMap = hashMapOf<String, Int>("Bir" to 1, "İki" to 2, "Üç" to 3)
    println(findLargestNumber(hashMap))

}

fun findLargestNumber(hashMap: HashMap<String, Int>): Int {

    var largestNumber = hashMap.values.first()

    for (item in hashMap.values) {
        if (item > largestNumber) {
            largestNumber = item
        }
    }
    return largestNumber

}