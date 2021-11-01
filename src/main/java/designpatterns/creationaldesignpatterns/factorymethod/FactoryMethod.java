package designpatterns.creationaldesignpatterns.factorymethod;

import java.util.Calendar;

public class FactoryMethod {

        /*
                          Factory Method Class (Creational Design Pattern)
                          - Doesn't expose instantiation logic
                          - Defer to subclasses
                          - Common interface
                          - Specified by architecture, implemented by user
                          - Returns various instances
                           - Multiple constructors
                          - Interface (contract) driven
                          - Subclasses involved
                          - Adaptable to environment more easily
                          - Parameter Driven
                          - Solves complex creation
                          - A little complex
                          - Opposite of a Singleton
                          - Examples
                           - Calendar
                           - ResourceBundle
                           - NumberFormat

                          Design
                          - Factory is responsible for lifecycle
                          - Common interface
                          - Concrete classes
                          - Parameterized create method
        */

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }
}
