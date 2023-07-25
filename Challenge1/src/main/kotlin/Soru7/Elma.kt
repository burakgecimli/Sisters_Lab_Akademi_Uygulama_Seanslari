package Soru7

class Elma(val vitaminDegeri: Int, adi: String, tadlilikDrecesi: Int) :
    Meyve(adi, tadlilikDrecesi) {

    fun yiyebilir() {
        println("$vitaminDegeri vitamin değerindeki $adi adlı meyvve $tatlilikDerecesi tadlılık derecesine sahiptir\nYiyebilirsiniz :)")

    }

}