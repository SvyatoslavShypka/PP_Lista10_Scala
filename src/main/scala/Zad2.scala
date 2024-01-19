import java.util.Date

object Zad2 {

  trait Debug {
    def debugVars(): Unit = {
      val fields = this.getClass.getDeclaredFields

      fields.foreach { field =>
        field.setAccessible(true)
        val fieldName = field.getName
        val fieldType = field.getType.getName
        val fieldValue = field.get(this)
        println(s"Pole: $fieldName => $fieldType, $fieldValue")
      }
    }
  }

  class Point(varx: Int, vary: Double) extends Debug {
    var x: Int = varx
    var y: Double = vary
    var a: String = "jakiś tekst"
  }

  class Student(val id: Long, val imie: String, val dataUrodzenia: Date, val ocena: Int) extends Debug

  class Przedmiot(val id: Long, val nazwa: String, val ocena: Float) extends Debug

  def main(args: Array[String]): Unit = {
    println("---------------Test1")
    var point: Point = new Point(3, 4.3)
    point.debugVars()

    println("---------------Test2")
    var przedmiot: Przedmiot = new Przedmiot(1L, "Paradygmaty Programowania", 5.0f)
    przedmiot.debugVars()

    println("---------------Test3")
    val darek = new Student(272678L, "Darek", new Date(), 5)
    darek.debugVars()
  }
}