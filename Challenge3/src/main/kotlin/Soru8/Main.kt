package Soru8

fun main() {

    val setA = setOf(1, 2, 3, 4)
    val setB = setOf(2, 4)
    val setC = subtractSets(setA, setB)
    println(setC)

}


fun subtractSets(set1: Set<Int>, set2: Set<Int>): Set<Int> = set1 - set2

