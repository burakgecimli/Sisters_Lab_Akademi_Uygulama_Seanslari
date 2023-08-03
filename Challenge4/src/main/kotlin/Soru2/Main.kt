package Soru2

fun main() {
    /*
     Verilen bir liste içerisindeki elemanların sayısını bir HashMap olarak döndüren bir fonksiyon yazın.
     */
    val liste = listOf<Int>(5, 6, 7, 8, 9, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7)

    println(counterOfItemList(liste))


}

fun counterOfItemList(list: List<Int>): HashMap<Int, Int> {

    val map = HashMap<Int, Int>()

    for (element in list) {

        if (map.containsKey(element)) {
            map[element] = map[element]!! + 1
        } else {
            map[element] = 1
        }
    }

    return map
}
