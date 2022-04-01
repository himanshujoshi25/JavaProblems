package JavaPrograms;

public class ReverseAnArray {
    public static void main(String[] args) {
        Integer[] arr = {10,30,50,70,90};

        System.out.println("Original Array:");
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + "  ");

        System.out.println("\nOriginal Array printed in reverse order:");
        for(int i = arr.length-1; i>=0; i--)
            System.out.print(arr[i] + "  ");
    }
}
