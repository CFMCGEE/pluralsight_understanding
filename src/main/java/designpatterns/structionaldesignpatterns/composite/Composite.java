package designpatterns.structionaldesignpatterns.composite;

import java.util.HashMap;
import java.util.Map;

public class Composite {

              /*
                        Composite Class (Structural Design Pattern)
                        - Components represent part or whole structure
                        - Compose objects into tree structures
                        - Individual object treated as a Composite
                        - Same operations applies on individual and composites
                        - Leaf and Composite have the same interface
                        - Unity between objects
                        - Generalizes a hierarchical structure
                        - Can simplify things too much
                        - Easier for clients
                        - Composite (deals with the hierarchical structure) != Composition (is one object containing another)
                        - Examples:
                         - java.awt.Component
                         - JSF widgets
                         - RESTful service GETs

                        Design
                        - Tree structured
                        - Component
                        - Leaf or Composite, same operations
                        - Composite knows about child objects
                        - Component, Leaf, Composite
              */

    public static void main(String[] args) {

        Map<String, String> personAbttributes = new HashMap<>();

        personAbttributes.put("site_role", "person");
        personAbttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();

        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();

        secAttributes.putAll(personAbttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);

    }
}
