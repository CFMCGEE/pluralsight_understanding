package collection_interfaces;

import java.util.*;

public class InterfaceList {


    public static void main(String[] args) {


        //What'sInTheList(value) reference variable = newKeyword typeOfList(ArrayList)<inferred>();
        List<String> languages = new ArrayList<String>();
        //List Methods
        /*
        .add(inserts a value)
        .indexOf(gets the index of the value you insert)
        .get(gets the index of the index position you insert)
        .remove(removes the value and index you insert)
        .set(changes the value in the index position)
        .toArray(returns an array of general objects without parameters)
        .subList(returns an array of values from one of the inputted indexes to the other)
        ...and many more
         */

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Go");

        languages.add("C#");
        languages.add("JS");

        System.out.println("-------------ARRAYLIST-----------");

        //for (dataTypeWhichMatchesYourList variable : nameOfList) {System.out.println(reference variable)}
        for (String languageTypes : languages) {
            System.out.println(languageTypes);
        }

        System.out.println("-------------TOARRAY-----------");

        Object[] langsArray1 = languages.toArray();

        String[] langsArray2 = languages.toArray(new String[0]);

        System.out.println(Arrays.toString(langsArray1));
        System.out.println(Arrays.toString(new String[] {langsArray2[0]}));


        System.out.println("-------------SUBLIST-----------");
        //from (inclusive index), to (exclusive index)
        List<String> someLangs = languages.subList(0, 3);

        System.out.println(someLangs);

        someLangs.set(2, "Groovy");

        System.out.println("-------------SIZE-----------");

        //checks the amount of values within the Set
        System.out.println(languages.size());



    }
}
