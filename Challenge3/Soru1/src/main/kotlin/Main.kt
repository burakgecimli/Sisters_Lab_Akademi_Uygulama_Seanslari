fun main() {

    /*
    Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.
     */
    val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5)

    println(listSum(arrayList))

}


fun listSum(arrayList: ArrayList<Int>): Int {
    var sum = 0
    for (i in arrayList) {
        sum += i
    }
    return sum
}