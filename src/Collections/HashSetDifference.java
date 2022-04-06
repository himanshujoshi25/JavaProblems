package Collections;
import java.util.HashSet;

public class HashSetDifference {
    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);
        numbers1.add(50);
        System.out.println("Elements in HashSet1: " + numbers1);

        HashSet<Integer> numbers2 = new HashSet<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        System.out.println("Elements in HashSet2: " + numbers2);

        // Difference between HashSet1 and HashSet2
        numbers1.removeAll(numbers2);
        System.out.println("Difference : " + numbers1);

    }
}
