package Soru5


fun main() {




}


fun findDuplicates(list: List<Int>): List<Int> {

    val duplicates = mutableListOf<Int>()

    val set = HashSet<Int>()

    for (element in list) {
        if (set.contains(element)) {
            duplicates.add(element)
        } else {
            set.add(element)
        }
    }
    return duplicates
}