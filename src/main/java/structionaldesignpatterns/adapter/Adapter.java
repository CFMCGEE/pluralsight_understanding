package structionaldesignpatterns.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {

      /*
                        Adapter Class (Structural Design Pattern)
                        - Plug adaptor
                        - Convert interface into another interface
                        - Integrate with Legacy
                        - Translates requests
                        - Client, Adapter, Adaptee
                        - Works after code is designed (including working with Legacy code)
                        - Retrofitted
                        - Provided different interface
                        - Simple solution
                        - Easy to implement
                        - Can provide multiple adapters
                        - Examples:
                         - Arrays -> Lists
                         - Streams

                        Design
                        - Client centric
                        - Integrate new with old
                        - Implemented to an Interface (but doesn't have to be)
                        - Adaptee can be the implementation



      */

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[] {42, 43, 44 };

        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);

        System.out.println(listOfInts);

    }

}
