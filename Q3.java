package Task5_javaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q3 {
    //to filter out the students whos name starts with 'A'
    public static void main(String[] args) {
        //creating a list of student names
        List<String> studNames = Arrays.asList("Arjjun","Aravind","Vicky","Rohit","Sanjay","Sundar");

        // ptocessing the name list as a stream and applying filter method to filter the names that starts with a
        //and then storing the filtered names in a new LISt named - FilteredNames
        List<String>  filteredNames = studNames.stream()
                .filter(s ->  s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students names before filtering : "+studNames);
        System.out.println("Filtered Names : "+filteredNames);





    }
}
