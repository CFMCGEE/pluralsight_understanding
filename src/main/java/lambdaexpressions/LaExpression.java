package lambdaexpressions;

public class LaExpression {

         /*

                                   Lambda Expressions
                                   - Instance of a functional interface
                                   - Not an instance of anonymous classes
                                    - Complied code is different
                                    - Uses invokedynamic (https://www.infoworld.com/article/2860079/invokedynamic-101.html#:~:text=A%3A%20invokedynamic%20is%20a%20bytecode,Edition%20of%20the%20JVM%20Specification)
                                    - Performances are 60x better
                                    - Can be faster
                                   - Implements a Functional Interface
                                    - A functional interface in Java is an interface that contains only a single abstract (unimplemented) method. (http://tutorials.jenkov.com/java-functional-programming/functional-interfaces.html)
                                    - Default and static methods do not count
                                    - Methods from the Object class do not count
                                   - They can be chained
                                   - Can be composed
                                   - Can create new lambdas by combing existing lambdas
                                   - Has the ability to combine lambdas of different types

                                   Autoboxing
                                   - Automatically converts a primitive type into an object

                                   Auto-unboxing
                                   - Automatically converts an object into a primitive type

                                   Comparator
                                    - Single Abstract Method:
                                     - int compare(T o1, T o2)
                                     - Example:
                                      - Comparator<Integer> cmp = (i1, i2) -> Integer.compare(i1, i2);
                                      - int compared = cmp.compare(10, 20);

                                   Auto-unboxing
                                   - Automatically converts an object into a primitive type

                                   The java.ulti.function package has more than 40 interface
                                   - Organized in 4 categories = [

                                    - Supplier<T>
                                     - Does not take any argument and produces any kind of object...
                                     - ...as long as it matches the T type defined inside the Supplier interface
                                     - Single Abstract Method:
                                      - T get()
                                     - Example:
                                      - () -> "Hello!";

                                    - Consumer<T>
                                     - Consumes any kind of object which is defined on the parameter...
                                     - ...which is the type of object that's going to be consumed
                                     - Single Abstract Method:
                                      - void accept (T t)
                                     - Example:
                                      - () ->
                                      System.out.println(s);

                                    - Predicate<T>
                                     - Takes any kind of object and performs testing on it to produce a Boolean as a primitive type...
                                     - ...it also is defined by the parameter
                                     - Single Abstract Method:
                                      - boolean test(T t)
                                     - Example:
                                      - string ->
                                           string.isEmpty();

                                    - Function<T, R>
                                     - Takes an object and returns another object of another type
                                     - Used for mapping
                                     - It's built on two parameters:
                                      - T (the type of object it takes)
                                      - R (the type of object it produces/returns)
                                     - Single Abstract Method:
                                      - R apply(T t)
                                     - Example:
                                      - user ->
                                           user.getName();

                                    - Runnable
                                     - Does not take any argument or return anything
                                     - Single Abstract Method:
                                      - void run()
                                     - Example:
                                      - () ->
                                      System.out.println(
                                         "I am alive!");
                                    ],

                                    Specialized Lambda Expressions = [

                                    - IntPredicate
                                     - Gets a result and returns it
                                     - Single Abstract Method:
                                      - int getAsInt();
                                     - Example:
                                      - () ->
                                      System.out.println(
                                         "I am alive!");

                                    //...

                                    ]

                                   How to write a Lambda Expression?

                                   First: Copy the block of parameters
                                   Second: Draw an arrow
                                   Third: Provide an implementation

                                   How to invoke a Lambda Expression?

                                   Supplier<String> supplier = () -> "Hello!";

          */

}
