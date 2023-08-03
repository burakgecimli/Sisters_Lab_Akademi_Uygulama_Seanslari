package Soru3

fun main() {


    /*
    - Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.
     */
    val hashMap = hashMapOf<String, Int>("Onüç" to 13, "Yirmidört" to 24, "Kırkbeş" to 45)
    println(hashMapSum(hashMap))


}

fun hashMapSum(hashMap: HashMap<String, Int>): Int = hashMap.values.sum()



