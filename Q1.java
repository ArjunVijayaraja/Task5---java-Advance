package Task5_javaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {
    //writing a program using map() method to convert a list of Strings into uppercase.

    public static void main(String[] args) {

        //Here the list is converted to Stream and then the by using stream the strinfs are converted to uppercase
//        List<String> lst = Arrays.asList("aBc","d","ef");
//        System.out.println("The values in the 'lst' Array : "+lst);
//        List<String> upperNames = lst.stream()
//                .map(s-> s.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println("After using STREAMS along with map() function");
//        System.out.println(upperNames);


        //By passing the strings directly to a stream--and processing using map function to convert into uppercase and stored in a list.
        List<String> upperNames = Stream.of("aBc","d","ef")
                .map(s-> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("After using STREAMS along with map() function");
        System.out.println(upperNames);


    }


}
