package Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<String>();
        names.add("ABC");
        names.add("XYZ");
        names.add("GHI");
        names.add("WRT");
        //Traversing elements in ascending order
        Iterator<String> itr= names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }

        System.out.println("Reverse Set: "+ names.descendingSet()); //Traversing elements in descending order
        System.out.println("First element: "+ names.pollFirst()); //retrieving first element
        System.out.println("Last element: "+ names.pollLast());   //retrieving last element
    }
}

