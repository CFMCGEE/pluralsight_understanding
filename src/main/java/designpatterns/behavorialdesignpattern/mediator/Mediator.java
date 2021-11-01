package designpatterns.behavorialdesignpattern.mediator;

import java.util.*;

public class Mediator {

                 /*

                          Mediator Class (Behavioral Design Pattern)
                          - Loose coupling
                          - well-defined, but complex
                          - Reusable components
                          - Hub / Router
                          - Defines interaction
                          - Object decoupling
                          - More specific
                          - Simplified Communication
                          - Mediator complexity
                          - Use with Command
                          - Examples:
                           - java.util.Timer
                           - javax.lang.reflect.Method#invoke()

                           Design
                           - Interface based
                           - Concrete class
                           - Minimizes inheritance
                           - Mediator knows about colleagues
                           - Mediator, ConcreteMediator

            */

    private Timer timer;

    public Mediator(int seconds) {

        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);

    }

    public static void main(String[] args) {

        System.out.println("About to schedule task");
        new Mediator(3);
        System.out.println("Task scheduled.");

    }

}
