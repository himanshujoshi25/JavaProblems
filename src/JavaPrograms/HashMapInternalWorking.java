package JavaPrograms;

import java.util.HashMap;

public class HashMapInternalWorking {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap(); //Default capacity=16
        hashMap.put("Name","XYZ");
        hashMap.put("City","Delhi");
        hashMap.put("Pin code","123");
        hashMap.put(null,"123"); //Hash code(null) = 0 and hence the index is 0

        System.out.println(hashMap);

    }
}
