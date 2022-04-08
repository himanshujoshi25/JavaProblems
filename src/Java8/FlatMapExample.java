package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(13,72,93);
        List<Integer> list2 = Arrays.asList(46,52,66);
        List<Integer> list3 = Arrays.asList(76,88,90);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream().flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);
    }

}
