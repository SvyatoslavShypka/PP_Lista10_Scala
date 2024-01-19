object Zad1 {

  trait Debug {
    def debugName(): Unit = {
      println(s"Klasa: ${getClass.getSimpleName}")
    }
  }

  class Point(varx: Int, vary: Int) extends Debug {
    private var x: Int = varx
    private var y: Int = vary
    private var a: String = "jakiś tekst"
  }

  class Student(varindex: Int, varname: String) extends Debug {
    private var index: Int = varindex
    private var name: String = varname
  }

  class Przedmiot(varnumer: Int, varnazwa: String) extends Debug {
    private var numer: Int = varnumer
    private var nazwa: String = varnazwa
  }

  def main(args: Array[String]): Unit = {
    println("---------------Test1")
    var p: Point = new Point(3, 4)
    p.debugName()

    println("---------------Test2")
    var student: Student = new Student(5, "Kamil")
    student.debugName()

    println("---------------Test3")
    var przedmiot: Przedmiot = new Przedmiot(1, "Paradygmaty Programowania")
    przedmiot.debugName()
  }
}