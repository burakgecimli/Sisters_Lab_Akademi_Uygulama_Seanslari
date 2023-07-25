package Soru7

fun main() {

    /*
     Meyve" adlı bir üst sınıf oluşturun ve bu sınıfta meyvelerin adı ve tatlılık derecesi gibi özellikleri tanımlayın.
     Ardından "Elma" adlı bir alt sınıf oluşturun ve bu sınıfta elmalara özgü özellikleri ekleyin.
     "Elma" sınıfı "Meyve" sınıfından kalıtım almalıdır.
     Elma sınıfında "vitaminDegeri" adlı bir özelliği ve "yiyebilir" adlı bir metodu ekleyin.
     */

    val elma = Elma(100, "Elma", 50)
    elma.yiyebilir()

}

