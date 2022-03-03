import scala.io.StdIn.readLine
import java.time.Year

object Potato extends App {
  val myName = readLine("What is your name?")
  println(s"Hi, $myName!")
  val AgeCount = readLine("What is your age").toDouble
  println(s"Cool, you are only $AgeCount years old")
  val year = Year.now.getValue
  val total = 100 - AgeCount + year
  println(s"You will be 100 years old in $total" )
}