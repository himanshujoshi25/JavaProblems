package Collections;

import java.util.HashSet;

public class HashSetUnion {

    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(10);
        evenNumbers.add(20);
        evenNumbers.add(30);
        evenNumbers.add(40);
        System.out.println("Elements of HashSet1: " + evenNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(11);
        oddNumbers.add(13);
        oddNumbers.add(15);
        oddNumbers.add(17);
        System.out.println("Elements of HashSet2: " + oddNumbers);

        // Union of two sets
        oddNumbers.addAll(evenNumbers);
        System.out.println("Elements of Union is: " + oddNumbers);
    }
}
