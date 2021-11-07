package lambdaexpressions.codingalong.lambdasexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

       //Predicate<String> filter = (String string) -> string.startsWith("t");
        Predicate<String> filter = string -> string.startsWith("t"); //<-- Simplified version

        strings.removeIf(filter);

       //Consumer<? super String> action = (String string) -> System.out.println(string);
        Consumer<? super String> action =  string -> System.out.println(string); //<-- Simplified version

        strings.forEach(action);

        //or...

        strings.removeIf(string -> !string.startsWith("t"));
        strings.forEach(string -> System.out.println(string));

    }

}
