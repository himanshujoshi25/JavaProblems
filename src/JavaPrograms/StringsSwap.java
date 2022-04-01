package JavaPrograms;

public class StringsSwap {

    public static void main(String[] args) {
        String a = "John";
        String b = "Wick";

        System.out.println("Strings before swapping: a = " + a + " and b = " + b);
        a = a + b;
        // Store initial string a in string b
        b = a.substring(0, a.length() - b.length());
        // Store initial string b in string a
        a = a.substring(b.length());
        System.out.println("Strings after swapping: a = " + a + " and b = " + b);
    }

}
