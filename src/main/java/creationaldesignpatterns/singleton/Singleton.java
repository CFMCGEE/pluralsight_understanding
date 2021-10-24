package creationaldesignpatterns.singleton;

public class Singleton {

            /*
                          Singleton Class (Creational Design Pattern)
                          - Only one instance created
                          - Guarantees control of a resource
                          - Lazily Loaded
                          - Returns same instance
                           - One constructor method - no args
                          - No interface
                          - No Subclasses
                          - Examples:
                           - Runtime
                           - Logger
                           - Spring Beans
                           - Graphic Manager

                          Design
                          - You want to guarantee one instance
                          - Easy to implement
                          - Solves a well-defined problem
                          - Don't abuse it
         */

    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherIntance = Runtime.getRuntime();

        System.out.println(anotherIntance);

        if (singletonRuntime == anotherIntance) {
            System.out.println("They are the same instance.");
        }

    }
}
