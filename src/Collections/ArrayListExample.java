package Collections;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> object = new ArrayList<String>();

        //Adding Elements to Array List
        object.add("John Wick");
        object.add("Will Smith");
        object.add("Dwayne Johnson");

        System.out.println("Printing names:"+ object);

        // Removing Elements from a Particular Index in Array List

        object.remove(1);

        System.out.println("Printing names:"+ object);

        // Removing Element using a Particular String Value From Array List
        object.remove("John Wick");
        System.out.println("Printing Array List:"+ object);

        // Adding Elements in Array List at a Particular INDEX
        object.add(1,"Steve Smith");
        System.out.println("Printing Array List:"+ object);

        // contains() is Used to check whether a String is Present or not

        System.out.println("Printing Array List:"+ object.contains("John Wick"));
        System.out.println("Printing Array List:"+ object.contains("Steve Smith"));

        // To check the total size of Array List
        int total = object.size();
        System.out.println("Printing Array List:"+total);

        //Remove All the elements from the Array list
        object.clear();
        System.out.println("Printing Array List:"+ object.size());
    }
}
