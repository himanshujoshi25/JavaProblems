package JavaPrograms;

import java.util.HashSet;

public class HashSetInternalWorking {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("Himanshu");
        hashSet.add("Joshi");
        hashSet.add("1234");

        System.out.println(hashSet); //Insertion order is not maintained

        hashSet.add("1234");
        System.out.println(hashSet); //Duplicates are not added but there is no error/exception

        hashSet.add(789); //Heterogeneous objects are allowed
        hashSet.add(null); //Null insertions are allowed
        System.out.println(hashSet);
    }
}
