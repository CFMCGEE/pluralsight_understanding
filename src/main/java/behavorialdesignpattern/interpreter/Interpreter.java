package behavorialdesignpattern.interpreter;

import java.util.regex.*;

public class Interpreter {

                        /*

                          Interpreter Class (Behavioral Design Pattern)
                          - Represent grammar (used when defining rules/validation)
                          - Interpret a sentence
                          - Map a domain
                          - Helps to define an abstract syntax tree (aka AST)
                          - Access to properties
                          - Functions as methods
                          - Adding new functionality changes every variant
                          - Special case pattern
                          - Examples:
                           - java.util.Pattern
                           - javax.text.Format

                           Design
                           - AbstractExpression
                           - Interpret
                           - TerminalExpression
                           - NonterminalExpression
                           - Context, AbstractExpression, TerminalExpression, NonterminalExpression, Client

            */

    public static void main(String[] args) {

        String input = "Lions, and tigers, and bears! Oh my!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }


    }

}
