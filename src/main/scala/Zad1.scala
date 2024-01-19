object Zad1 {

  trait Debug {
    def debugName(): Unit = {
      println(s"Klasa: ${getClass.getSimpleName}")
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

  class Przedmiot(varnumer: Int, varnazwa: String) extends Debug {
    var numer: Int = varnumer
    var nazwa: String = varnazwa
  }

  def main(args: Array[String]): Unit = {
    var p: Point = new Point(3, 4)
    p.debugName()

    var student: Student = new Student(5, "Kamil")
    student.debugName()

    var przedmiot: Przedmiot = new Przedmiot(1, "Paradygmaty Programowania")
    przedmiot.debugName()
  }
}