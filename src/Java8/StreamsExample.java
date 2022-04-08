package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "lmn", "efg", "xyz","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        long count = strings.stream().filter(a -> a.isEmpty()).count();
        System.out.println(count);

        List<Integer> list = Arrays.asList(59, 18, 100, 25, 4);
        List<Integer> sortedElements = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedElements);

        List<Integer> num = Arrays.asList(1, 2, 3, 4);
        long total = list.stream().count();
        System.out.println(total);

        List<String> names = Arrays.asList("John", "David", "Jack", "Dwayne", "Joseph","Rahul", "Sachin");
        long len = names.stream() .filter(x -> x.length()> 5).count();
        System.out.println(len);

        List<String> name = names.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
        System.out.println(name);

        List<String> letter = names.stream().filter(x -> x.startsWith("J")).collect(Collectors.toList());
        System.out.println(letter);

        List<String> states = Arrays.asList("Delhi", "Mumbai", "Punjab", "Kerala", "Rajasthan");
        String state = states.stream().map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
        System.out.println(state);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(distinct);

        List<String> animals = Arrays.asList("Dog", "Horse", "Cat", "Lion");
        animals.forEach(s -> System.out.println(s));

        System.out.println("____________________________________________________________");
        animals.forEach(System.out::println);

    }
}
