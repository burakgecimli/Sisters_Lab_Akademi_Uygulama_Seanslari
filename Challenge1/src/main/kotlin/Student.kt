class Student(val name: String, val surName: String, val no: Int) {

    fun info() {
        println("$name $surName $no")
    }

}


fun main() {
    /*
  Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri
  içeren özellikleri tanımlayın.Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu
  öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın
 */
    val std1 = Student("Ali", "Gümüş", 123)
    val std2 = Student("Ahmet", "Aslan", 456)
    val std3 = Student("Begüm", "Kartal", 789)
    val std4 = Student("Berk", "Toz", 987)

    val studentList = arrayListOf<Student>(std1, std2, std3, std4)

    for (item in studentList) {
        item.info()
    }

}