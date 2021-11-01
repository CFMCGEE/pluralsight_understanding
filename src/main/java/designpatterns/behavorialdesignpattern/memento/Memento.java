package designpatterns.behavorialdesignpattern.memento;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Memento {

                     /*

                          Memento Class (Behavioral Design Pattern)
                          - Restore Object to previous state
                          - Externalize internal state
                          - Undo/Rollback
                          - Shields complex internals
                          - Used to capture State
                          - Independent state
                          - Caretaker/History
                          - Can get heavy with history
                          - Recreate state
                          - Similar to Command (difference being it emphasises history and state rather than requests)
                          - Examples:
                           - java.util.Date
                           - java.io.Serializable

                           Design
                           - Class based
                           - Roles
                            - Originator
                            - Caretaker
                            - Memento
                           - Magic Cookie
                           - Originator, Caretaker, Memento

            */

    private static Employee deserialize() {

        Employee emp = null;

        try {

            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return emp;
    }

    public static void serialize(Employee emp) {

        try {

            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmpy = deserialize();

        System.out.println(newEmpy.getName());

    }

}
