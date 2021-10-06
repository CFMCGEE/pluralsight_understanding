package collection_interfaces;

import java.util.*;

public class InterfaceSet {
    public static void main(String[] args) {

        //What'sInTheSet(value) reference variable = newKeyword typeOfSet(HashSet)<inferred>();
        Set<String> languages = new HashSet<>();

        Set<String> frontEnd = new HashSet<>(Arrays.asList("HTML", "CSS", "JS"));
        Set<String> backEnd = new HashSet<>(Arrays.asList("Java", "C#", "Ruby", "JS"));
        Set<String> intersection = new HashSet<>(backEnd);
        Set<String> union = new HashSet<>(backEnd);

        Set<String> languages1 = new TreeSet<>();
       //Set Methods
        /*
        .add(inserts a value)
        .retainAll(returns the intersection of sets)
        .addAll(returns the union of sets)
        ...and many more
         */

                   //(value)
        languages.add("HTML");
        languages.add("CSS");
        languages.add("JavaScript");

        languages.add("Ruby");
        languages.add("Java");

        System.out.println("-------------NO DUPLICATES-----------");

      //No duplication
        for (String languageTypes : frontEnd) {
            System.out.println(languageTypes);
        }

        System.out.println("-------------INTERSECTION-----------");

      //Intersection
        intersection.retainAll(frontEnd);
        for (String languageTypes : intersection) {
            System.out.println(languageTypes);
        }

        System.out.println("-------------UNION-----------");

      //Union
        union.addAll(frontEnd);
        for (String languageTypes : union) {
            System.out.println(languageTypes);
        }

        System.out.println("-------------REMOVAL-----------");

      //Removal
            frontEnd.remove("JS");
        for (String languageTypes : frontEnd) {
            System.out.println(languageTypes);
        }

        System.out.println("-------------REMOVE ALL-----------");

      //Remove all
        intersection.addAll(frontEnd);
        intersection.removeAll(backEnd);
        for (String languageTypes : intersection) {
            System.out.println(languageTypes);
        }  //prints out everything that wasn't removed (Specifically for this, removes all the back end languages and leaves the front end)


        System.out.println("-------------UNSORTED UNIQUE LIST V SET-----------");

        String[] codingLanguages = {"Java", "C#", "Go"};
        String[] moreCodingLanguages = {"Java", "C#", "JavaScript", "Python"};

      //List trying to be unique
        List<String> combined1 = new ArrayList<>(Arrays.asList(codingLanguages));
        for (String codingLanguage : moreCodingLanguages) {
            if (!combined1.contains(codingLanguages)) {
                combined1.add(codingLanguage);
            }
        }

      //Unique Set
        Set<String> combinedSet1 = new HashSet<>(Arrays.asList(codingLanguages));
        combinedSet1.addAll(Arrays.asList(moreCodingLanguages));

        System.out.println(combinedSet1); // Expected output (in any order): [C#, Python, JavaScript, Java, Go]

        System.out.println("-------------SORTED UNIQUE LIST V SET-----------");

        //List trying to be unique and sorted
        List<String> combined2 = new ArrayList<>(Arrays.asList(codingLanguages));
        for (String codingLanguage2 : moreCodingLanguages) {
            if (!combined2.contains(codingLanguages)) {
                combined2.add(codingLanguage2);
            }
            combined2.sort(String::compareTo);
        }

        //Sorted and Unique Set
        Set<String> combinedSet2 = new TreeSet<>(Arrays.asList(codingLanguages));
        combinedSet2.addAll(Arrays.asList(moreCodingLanguages));

        System.out.println(combinedSet2); // Expected output: [C#, Go, Java, JavaScript, Python]

        System.out.println("-------------SIZE-----------");

                                   //checks the amount of values within the Set
        System.out.println(languages.size());



    }
}
