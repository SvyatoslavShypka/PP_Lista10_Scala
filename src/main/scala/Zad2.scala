//import scala.reflect.runtime.universe._
//import scala.reflect.macros.Universe
//import scala.reflect.ClassTag
//import scala.reflect.runtime.{ universe => pl }

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

  class Point(varx: Int, vary: Int) extends Debug {
    var x: Int = varx
    var y: Int = vary
    var a: String = "jakiś tekst"
  }

  class Student(varindex: Int, varname: String) extends Debug {
    var index: Int = varindex
    var name: String = varname
  }

  class Przedmiot(val id: Long, val nazwa: String, val ocena: Float) extends Debug

  class Student(val id: Long, val imie: String, val dataUrodzenia: Date, val ocena: Int) extends Debug


  def main(args: Array[String]): Unit = {
    println("---------------Test1")
    var point: Point = new Point(3, 4)
    point.debugVars()

    println("---------------Test2")
    var student: Student = new Student(5, "Kamil")
    student.debugVars()

    println("---------------Test3")
    val darek = new Student(272678L, "Darek", new Date(), 5)
    darek.debugVars()
  }
}