import java.util.ArrayList;
import java.util.List;

public class GenericsCode {
    //generics allows the author of a class or method to introduce the Type Parameter
    //which are SYMBOLS that can be substituted for any CONCRETE TYPE.
    public static void main(String[] args) {
        List<String> listOfStrings;
        //has a generic type parameter E which is the type of elements in the list.
        // List<E>listOfStrings, the E in the diamond bracket is what we are talking about. it can be substitued for more concrete dataTypes such as String, Integer etc
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        //before Generics we could not tell Java that a List only contained strings.
        String hello = strings.get(0);
        String world = strings.get(1);
        System.out.println(hello+" "+ world);

        //another major benefit of generics is that it allows you to allow generic classes and algorithms.
        //generics is also useful to bound typed parameters.
        //when using generics even for interfaces, it always extends. never implements.
        //
         }
}
