package Collections;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> subjects = new LinkedHashMap<>();
        subjects.put(1,"Physics");
        subjects.put(2,"English");
        subjects.put(3,"Chemistry");
        subjects.put(4,"Maths");
        System.out.println("Elements are: " + subjects);

        // Inserts the specified key/value mapping to the map if the specified key is not present in the map
        subjects.putIfAbsent(2,"English");
        subjects.putIfAbsent(5,"Biology");
        System.out.println("Updated Elements are: " + subjects);

        //Returns a set of all the key/value mapping of the map
        System.out.println("Key/Value pairs: " + subjects.entrySet());

        //Returns a set of all the keys of the map
        System.out.println("Keys: " + subjects.keySet());

        //Returns a set of all the values of the map
        System.out.println("Values: " + subjects.values());

        //Returns the value associated with the specified key
        System.out.println(subjects.get(4));

        //Returns the value associated with the specified key.
        // If the key is not found, it returns the specified default value.
        String value1 = subjects.getOrDefault(1,"History");
        String value2 = subjects.getOrDefault(10,"History");
        System.out.println(value1);
        System.out.println(value2);

        //Removing a key/value pair using a key
        subjects.remove(5);
        System.out.println("Updated Elements are: " + subjects);

        //Removing a key/value pair by passing a key/value pair
        subjects.remove(2,"English");
        System.out.println("Updated Elements are: " + subjects);

        //finds whether a key is present or not
        System.out.println(subjects.containsKey(3));

        //finds whether a value is present or not
        System.out.println(subjects.containsValue("Maths"));
        System.out.println(subjects.containsValue("Hindi"));

        //finds total key/value pairs present in Linked HashMap
        System.out.println(subjects.size());

        //finds whether a Linked Hashmap is empty or not
        System.out.println(subjects.isEmpty());

        //clears all the elements of Linked HashMap
        subjects.clear();

        System.out.println(subjects.isEmpty());

    }
}
