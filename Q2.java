package Task5_javaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q2 {
    //to Print a list with non-empty strings
    public static void main(String[] args) {
        List<String> ListString = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        //The list is converted to a stream and by using filter method the empty names are removed and stored in a new list
        List<String> nonEMptyLst = ListString.stream()
                .filter(( s) ->   s.length()>0)
                .collect(Collectors.toList());

        System.out.println(ListString);
        System.out.println(nonEMptyLst);


    }
}
