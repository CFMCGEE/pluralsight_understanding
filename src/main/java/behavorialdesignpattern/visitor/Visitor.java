package behavorialdesignpattern.visitor;

public class Visitor {

              /*

                          Visitor Class (Behavioral Design Pattern)
                          - Separate an Algorithm from Object
                          - Adding new features
                          - Maintain Open/Closed principle
                          - Visitor changes
                          - Externalized changes
                          - Multiple visitors
                          - Expect changes
                          - Minor complexity
                          - Examples:
                           - java.lang.model.element.Element
                           - java.lang.model.element.ElementVisitor

                           Design
                           - Interfaced based
                           - Implementation of Visitor and Element
                           - Elements have visit method
                           - Visitor knows every Element
                           - Visitor, ConcreteVisitor, Element, ConcreteElement

            */

    public static void main(String[] args) {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();

        System.out.println(shippingCost);

    }
}
