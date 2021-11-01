package behavorialdesignpattern.state;

public class State {

            /*

                          State Class (Behavioral Design Pattern)
                          - Localize state behavior
                          - State Object
                          - Separates What from Where
                          - Follows the Open-Close-Principle (OCP)
                          - Transitions
                          - Contained in its own class (Class per State)
                          - Simplifies cyclomatic complexity
                          - Adding additional states made easier
                          - More classes
                          - Similar implementation to Strategy
                          - Examples:
                           - No good examples... but JSF and Iterator

                           Design
                           - Abstract Class / Interface based
                           - Each state is Class based
                           - Context unaware
                           - Context, State, ConcreteState

            */


    public static void main(String[] args) {

        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

    }


}
