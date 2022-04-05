package Collections;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        //Adding Elements to vector
        vector.add("John Wick");
        vector.add("Will Smith");
        vector.add("Dwayne Johnson");

        System.out.println("Printing names:"+ vector);

        // Removing Elements from a Particular Index in vector

        vector.remove(1);

        System.out.println("Printing names:"+ vector);

        // Removing an Element using a Particular String Value From vector
        vector.remove("John Wick");
        System.out.println("Printing vector elements:"+ vector);

        // Adding Elements in vector at a Particular INDEX
        vector.add(1,"Steve Smith");
        System.out.println("Printing vector elements:"+ vector);

        // contains() is Used to check whether a String is Present or not

        System.out.println("Printing vector elements:"+ vector.contains("John Wick"));
        System.out.println("Printing vector elements:"+ vector.contains("Steve Smith"));

        // To check the total size of vector
        int total = vector.size();
        System.out.println("Printing vector elements:"+total);

        //Remove All the elements from the vector
        vector.clear();
        System.out.println("Printing vector elements:"+ vector.size());
    }
}

