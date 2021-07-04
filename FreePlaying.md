# Free Playing


- Basic syntax exploration
    - `{` braces can be avoided and indentation matters
      ```
      Old Style:
      class Blah {
        def someMethod: Unit = {
          println("first")
          println("second")
        }
      }
      
      New Style: 
      class Blah:
        def someMethod: Unit = 
          println("first")
          println("second")
      ```
    - `with` mix-in can be replaced with `,`
      `class Blah extends Foo with Bar` can be written as `class Blah extends Foo, Bar`
      
- With `@varargs` annotation variable number of arguments can be used interchangeable between java and scala
- With `@targetName` annotation alternative name can be generated for Java
- With `@main` annotation can be specified main method
- `scala.jdk` contains different kind of converters between java and scala, such as collections, option <-> optional, future <-> completable future etc..
- Java interfaces can be used directly in scala
      