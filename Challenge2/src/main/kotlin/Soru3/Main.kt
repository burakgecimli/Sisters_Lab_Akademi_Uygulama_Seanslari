package Soru3

fun main() {

    /*

     Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin
     Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın
     */
    val arrayList = arrayListOf<Int>()

    for (i in 1..5) {
        println("Sayıları Giriniz")
        val num = readln().toInt()
        arrayList.add(num)
    }
    println(lissSum(arrayList))

}

fun lissSum(arrayList: ArrayList<Int>): Int {

    var sum = 0
    for (i in arrayList) {
        sum += i
    }
    return sum
}