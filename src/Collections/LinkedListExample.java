package Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cityNames = new LinkedList<>();
        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        System.out.println("The names of the cities are: " + cityNames);

        // add() method without the index parameter
        cityNames.add("Jaipur");
        cityNames.add("Hyderabad");
        System.out.println("The names of the cities are: " + cityNames);

        // add() method with the index parameter
        cityNames.add(1, "Kanpur");
        System.out.println("The names of the cities are: " + cityNames);

        // get the element from the linked list
        String city = cityNames.get(2);
        System.out.println("City at index 2 is:" + " " + city);

        // Change element at index 0
        cityNames.set(0,"Chennai");
        System.out.println("The names of the cities are: " + cityNames);

        //Removing element by passing value
        cityNames.remove("Kolkata");
        System.out.println("The names of the cities are: " + cityNames);

        //Removing element by passing index
        cityNames.remove(0);
        System.out.println("The names of the cities are: " + cityNames);

        // Finds whether an element is present in Linked list or not
        System.out.println(cityNames.contains("Mumbai"));

        // Finds the size of the linked list
        System.out.println(cityNames.size());

        //Deleting all the elements of linked list
        cityNames.clear();
        System.out.println(cityNames.size());

    }
}
