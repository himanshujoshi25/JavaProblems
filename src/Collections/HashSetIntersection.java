package Collections;
import java.util.HashSet;

public class HashSetIntersection {

    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(21);
        numbers1.add(30);
        numbers1.add(55);
        numbers1.add(41);
        System.out.println("Elements of HashSet1: " + numbers1);

        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(29);
        numbers2.add(41);
        numbers2.add(21);
        numbers2.add(33);
        System.out.println("Elements of HashSet2: " + numbers2);

        // Intersection of two sets
        numbers2.retainAll(numbers1);
        System.out.println("Elements of Intersection is: " + numbers2);
    }
}
