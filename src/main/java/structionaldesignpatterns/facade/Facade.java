package structionaldesignpatterns.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Facade {

                  /*
                        Facade Class (Structural Design Pattern) (Fa-cade and not Fa-caid)
                        - Make an API easier to user (Cleaner API)
                        - Reduce dependencies on outside code
                        - Simplify the interface or client usage (Simplifies Client interface)
                        - Usually a refactoring pattern
                        - Works with composites
                        - Easy Pattern to implement
                        - Refactoring Pattern
                        - Examples:
                         - java.net.URL
                         - javax.faces.context.FacesContext

                        Design
                        - Class that utilizes composition
                        - Shouldn't have a need for inheritance
                        - Typically encompasses full lifecycle
                  */

    public static void main(String[] args) throws Exception {

        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader in = new BufferedReader(new InputStreamReader((url.openStream())));

        String inputLine;

        while((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

    }
}
