package behavorialdesignpattern.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibility {

                /*

                          Chain Of Responsibility Class (Behavioral Design Pattern)
                          (Coupling is nothing but the dependency of one class on the other...
                          while Decoupling allows the separation of object interaction from classes and inheritance into distinct layers of abstraction...)
                          - Decoupling of sender and receiver
                          - Receiver contains referencer to next receiver (or successor)
                          - Promote loose coupling
                          - No Handler - OK
                          - Handler is unique
                          - Knows of Successor
                          - Can utilize the Command
                          - Decouples sender and receiver
                          - Runtime configuration
                          - Hierarchical in nature
                          - Careful with large chains
                          - Examples:
                           - java.util.logging.Longer#log()
                           - java.servlet.Filter#doFilter()
                           - Spring Security Filter Chain

                           Design
                           - Chain of receiver objects
                           - Each handler is based off an interface
                           - ConcreteHandler for each implementation
                           - Each Handler has a reference to the next
                           - Handler, ConcreteHandler

            */

    private static final Logger logger = Logger.getLogger(ChainOfResponsibility.class.getName());

    public static void main(String[] args) {

        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finner or finest");


    }

}
