package lambdaexpressions.codingalong.lambdasexample;

import java.util.function.*;

public class SupplierAndConsumerExample {

    public static void main(String[] args) {

      // Supplier Example

      // Basic
        // Supplier<String> supplier = () -> "Hello!";

      // Multi-Line
         Supplier<String> supplier = () -> {

             System.out.println("I am inside the Supplier");

             return "Hello!";

         };

         String string = supplier.get();

         System.out.println("string = ".concat(string));

     // Consumer Example

     // Basic
      // Consumer<String> consumer = (String s) -> System.out.println(s);

     // Multi-Line
        Consumer<String> consumer = (String s) -> {

            System.out.println("I am inside the Consumer");

            System.out.println(s);

        };

        consumer.accept("Hello");

    }

}
