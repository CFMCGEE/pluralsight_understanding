package designpatterns.structionaldesignpatterns.flyweight;

public class Flyweight {

                  /*
                        Flyweight Class (Structural Design Pattern)
                        - More efficient use of memory
                        - Large number of similar objects
                        - Immutable (Objects)
                        - Most of the objects states can be extrinsic
                        - Focuses on Memory Optimization (as Flyweight is an Optimization Pattern)
                        - A little bit complex
                        - Great for Memory Management
                        - Used a lot by the code API
                        - Examples:
                         - java.lang.String
                         - java.lang.Integer#valueOf(int)
                         - Boolean, Byte, Character, Short, Long

                        Design
                        - Pattern of patterns
                        - Utilizes a Factory
                        - Encompasses Creation and Structure
                        - Client, Factory, Flyweight, ConcreteFlyweight

                  */

    public static void main(String[] args) throws Exception {

        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));

    }
}
