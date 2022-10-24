import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pair<String> strings = new Pair<>("hello", "world");
        Pair<Integer> integers = new Pair<>(2, 3);
        System.out.println(strings);
        System.out.println(integers);
        Pair<Person> people = new Pair<>(new Person("mem"), new Person("abdel"));
        System.out.println(people);

        Map<String, Integer> map = new HashMap<>();
        map.put("mem",24);
        map.put("abdel", 20);
        Pairs<String, Integer> stringIntegerPair = new Pairs<>("mem",20);
        String first = stringIntegerPair.getFirst();
        Integer second = stringIntegerPair.getSecond();
    }
}
