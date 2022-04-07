package Collections;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();

        // add elements to hashmap
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C++");
        System.out.println("HashMap elements are: " + languages);
        // get() method to get value
        String value = languages.get(1);
        System.out.println("First value of the Hashset is: " + value);

        // return set view of keys
        System.out.println("Keys: " + languages.keySet());

        // return set view of values
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // change element with key 2
        languages.replace(2, "Go");
        System.out.println("HashMap elements are: " + languages);

        // remove element associated with key 1
        String val = languages.remove(1);
        System.out.println("Removed value: " + val);

        System.out.println("Updated HashMap elements are: " + languages);

        //finds whether a key is present or not
        System.out.println(languages.containsKey(3));

        //finds whether a value is present or not
        System.out.println(languages.containsValue("Python"));

        //finds total key/value pairs present in HashMap
        System.out.println(languages.size());

        //finds whether a hashmap is empty or not
        System.out.println(languages.isEmpty());

        //clears all the elements of HashMap
        languages.clear();

        System.out.println(languages.isEmpty());
    }
}
