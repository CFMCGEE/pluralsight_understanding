package designpatterns.behavorialdesignpattern.iterator;

import java.util.*;

public class Iterator {

             /*

                          Iterator Class (Behavioral Design Pattern)
                          - Efficient way to traverse a container
                          - Doesn't expose underlying structure
                          - Decouples algorithms
                          - Sequential
                          - Algorithm is removed
                          - No index
                          - Concurrent modification
                          - Simplifies client
                          - Foreach
                          - Examples:
                           - java.util.Iterator
                           - javax.text.Enumeration

                           Design
                           - Interface based
                           - Factory Method based
                           - Independent, but fail first
                           - Enumerators are fail safe
                           - Iterator, ConcreteIterator

            */

    public static void main(String[] args) {


        //List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

//        for (int i = 0; i < names.size(); i++) {
//
//            String name = names.get(i);
//
//            System.out.println(name);
//
//        }

//        for (String name : names) {
//            System.out.println(name);
//        }

        java.util.Iterator<String> namesItr = names.iterator();

        while(namesItr.hasNext()) {

            String name = namesItr.next();

            System.out.println(name);

            namesItr.remove();

        }

        System.out.println("Names size: " + names.size());

    }

}
