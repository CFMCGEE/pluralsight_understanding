package behavorialdesignpattern.command;

public class Command {

                    /*

                          Command Class (Behavioral Design Pattern)
                          - Encapsulates each request as an Object (specifically encapsulates the action)
                          - Each callback is Object-oriented
                          - Decouple sender from processor
                          - Often used for "undo" functionality
                          - Object per command
                          - Class contains the 'what'
                          - Very few drawbacks
                          - Examples:
                           - java.lang.Runnable
                           - javax.swing.Action

                           Design
                           - Object per command
                           - Command Interface
                           - Contains an Execute Method
                           - 'Unexecute' method
                           - Reflection
                           - Command, Invoker, ConcreteCommand

            */

    public static void main(String[] args) {

        Task task1 = new Task(10, 12); // encapsulates request
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        thread1.start(); //invoker

        Thread thread2 = new Thread(task2);
        thread2.start();

    }
}
