package creationaldesignpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    /*
                          Prototype Class (Creational Design Pattern)
                          - Avoids costly creation
                          - Avoids subclassing
                          - Typically doesn't use "new"
                          - Often utilizes an Interface
                          - Usually implemnted new a Registry
                          - Lighter weight construction
                           - Copy Constructor or Clone
                          - Shallow or Deep
                          - Copy of itself
                          - Guarantee unique instance
                          - Example:
                           - java.lang.Object#clone()

                          Design
                          - Clone/Cloneable
                          - Avoids keyword "new"
                          - Although a copy, each instance is unique
                          - Costly constructon not handled by client
                          - Can still utilize parameters for construction
                          - Shallow VS Deep Copy
     */

    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star Wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getSql());

        System.out.println(firstStatement.getParameters());

        System.out.println(firstStatement.getRecord());

        Statement secondStatement = new Statement(sql, parameters, record);

        System.out.println(secondStatement.getSql());

        System.out.println(secondStatement.getParameters());

        System.out.println(secondStatement.getRecord());

    }
}
