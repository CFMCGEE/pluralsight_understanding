package designpatterns.structionaldesignpatterns.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Decorator {

              /*
                        Decorator Class (Structural Design Pattern)
                        - Can be referred to as a wrapper
                        - Add behavior without affecting others
                        - More than just inheritance (Confused with inheritance)
                        - Single Responsibility Principle
                        - Compose behavior dynamically
                        - Contains another entity (actually composition)
                        - Modifies behavior (adds)
                        - Doesn't change underlying object
                        - Original object can stay the same
                        - Unique way to add functionality
                        - Can be more complex for clients
                        - Chained Pattern
                        - Decorator points to its own type
                        - Dynamically add functionality
                        - Examples:
                         - java.io.InputStream
                         - java.ulti.Collections#checkedList
                         - UI components

                        Design
                        - Inheritance based
                        - Utilizes compositions and inheritance (is-a, has-a)
                        - Alternative to subclassing
                        - Constructor requires instance from hierarchy
              */

    public static void main(String[] args) throws Exception {

        File file = new File("./output.txt" );
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);

        doStream.close();
        oStream.close();

    }
}
