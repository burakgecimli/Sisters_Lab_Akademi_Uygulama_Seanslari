package Soru2

import java.util.ArrayList

fun main(args: Array<String>) {

    /*
    Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın
     */

    val arr = arrayListOf<Int>(1, 2, 3, 4, 5)
    filter(arr)

}

fun filter(arr: ArrayList<Int>) {

    for (item in arr) {
        if (item % 2 != 0) {
            println(item)
        }
    }
}