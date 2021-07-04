package learning.scala3;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class JavaClass {
    public static List<String> getStrings() {
        return new ArrayList<String>(List.of("a", "b", "c"));
    }

    static Optional<String> oString = Optional.of("foo");
    static Optional<String> oEmptyString = Optional.empty();
}

interface Animal {
    void speak();
}

interface Wagging {
    void wag();
}

interface Running {
    // an implemented method
    default void run() {
        System.out.println("I’m running");
    }
}
