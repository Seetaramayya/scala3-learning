package learning.scala3.hello.world

/**
 * - No need to have wrappeer object
 * - Generates following files when this file is compiled
 * {{{
 *  Hello$package$.class
 *  Hello$package.class
 *  Hello$package.tasty
 *  ControlStructures.scala
 *  hello.class
 *  hello.tasty
 * }}}

 */
@main def hello(x: Int) =
  if x < 0 then println("negative") else if x == 0 then println("zero") else println("positive") // new style
  if (x < 0) println("negative") else if(x == 0) println("zero") else println("positive") // old style
  val ints = List(1, 2, 3, 4, 5)
  for i <- ints do println(i) // new style
  for (i <- ints) println(i) // old style

  // old style
  for {
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 2
    if j == 'b'
  } {
    println(s"i = $i, j = $j")
  }

  // new style
  for
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 2
    if j == 'b'
  do
    println(s"i = $i, j = $j")   // prints: "i = 2, j = b"

  val doubles = for i <- ints yield i * 2
  println(s"for expression result $doubles")

  var mutableVariable = x
  while mutableVariable < 0 do
    println(s"i = $mutableVariable")
    mutableVariable += 1
  