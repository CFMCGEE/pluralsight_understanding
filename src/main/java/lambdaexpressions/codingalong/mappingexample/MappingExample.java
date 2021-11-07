package lambdaexpressions.codingalong.mappingexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MappingExample {

    public static void main(String[] args) {

        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<>();

        Function<User, String> toName = (User user) -> user.getName();
        for (User user : users) {

            String name = toName.apply(user);
            names.add(name);

        }

       //Consumer<User> action = (User user) -> System.out.println(user);
       //users.forEach(action);

        users.forEach(user -> System.out.println(user));
        //names.forEach(user -> System.out.println(user));  //<--- both do the same thing
        names.forEach((String s) -> System.out.println(s)); //<--- both do the same thing

    }

}
