package designpatterns.creationaldesignpatterns.builder;

public class Builder {

    /*
                        Builder Class (Creational Design Pattern)
                        - Handles complex constructors
                        - Large number of parameters
                        - Immutability
                        - No interface required
                        - Can be a separate class
                        - Works with legacy code
                        - Examples:
                         - StringBuilder
                         - DocumentBuilder
                         - Locale.Builder

                        Design
                        - Flexibility over telescoping constructors
                        - Static inner class
                        - Calls appropriate constructor
                        - Negates the need for exposed setters
     */

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an exmaple ");

        builder.append("of the builder pattern.");

        builder.append("It has methods to append ");

        builder.append("almost anything we want a String. ");

        builder.append(42);

        System.out.println(builder.toString());

    }
}
