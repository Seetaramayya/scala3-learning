@main def hello: Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"


object Start {
  def main(args: Array[String]): Unit =
    println("Start")
     if (5 % 2 == 0) then
       println("it is even")
     else
       println("it is not even, it is odd")
}