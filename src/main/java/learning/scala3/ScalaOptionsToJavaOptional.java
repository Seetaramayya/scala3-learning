package learning.scala3;

import java.util.Optional;
import static scala.jdk.javaapi.OptionConverters.toJava;

public class ScalaOptionsToJavaOptional {
    public static void main(String[] args) {
        System.out.println("Scala options can be converted to java optionals with OptionConverters");
        Optional<String> stringSome = toJava(ScalaObject.someString());   // Optional[foo]
        Optional<String> stringNone = toJava(ScalaObject.noneString());   // Optional.empty
        System.out.printf("stringSome = %s\n", stringSome);
        System.out.printf("stringNone = %s\n", stringNone);

        System.out.println("Scala varargs can be used in java if it is annottated with @varargs");
        Varargs.printAll("Scala", "Now", "supports", "compatible", "varargs");

        System.out.println("Scala symbolic method names can be used with alternative names if it is annotatted with @targetName");
        System.out.println(AlternativeNames.add(1, 2));
    }
}
