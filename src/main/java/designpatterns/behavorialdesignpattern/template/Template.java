package designpatterns.behavorialdesignpattern.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Template {

             /*

                          Template Class (Behavioral Design Pattern)
                          - Code reuse
                          - Inversion of Control (IoC) Frameworks
                          - Algorithm emphasis
                          - Focused on the same algorithm
                          - Class based
                          - Compile time
                          - Guarantees Algorithm adherence
                          - Easier implementation
                          - Examples:
                           - java.util.Collections#sort()
                           - java.util.AbstractList#indexOf()

                           Design
                           - Abstract Base class
                           - Base calls Child
                           - Hooks (may be overridden)
                           - Operations (must be overridden)
                           - AbstractBase, ConcreteClass

            */

    private static void printContents(List<Person> people) {

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    public static void main(String[] args) {

        Person bryan = new Person("Bryan", "801-555-1212", 39);
        Person mark = new Person("Mark", "801-444-1234", 41);
        Person chris = new Person("Chris", "801-222-5151", 38);

        List<Person> people = new ArrayList<Person>();

        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");

        printContents(people);

        Collections.sort(people);

        System.out.println("\nSorted by age");

        printContents(people);

    }

}
