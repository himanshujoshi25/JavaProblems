package Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(78);
        numbers.add(32);
        numbers.add(78); //Duplicate elements are not allowed in HashSet
        numbers.add(21);
        System.out.println("Elements are:"+ " "+numbers);
        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("Printing elements using iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(",");
        }

        numbers.add(42);
        numbers.add(89);
        // Removing an element
        numbers.remove(78);
        System.out.println("\nElements are:"+ " "+numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(78));
        System.out.println(numbers.contains(42));
        System.out.println(numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers.size());

    }
}

