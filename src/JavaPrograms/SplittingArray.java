package JavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to divide the array of numbers into 3 parts and left the undivided numbers at last.

public class SplittingArray {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array");

        int len = scanner.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the  values of array:");
        for (int i=0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int quotient = arr.length / 3;

        List<Integer> arr1=new ArrayList<Integer>();
        List<Integer> arr2=new ArrayList<Integer>();
        List<Integer> arr3=new ArrayList<Integer>();
        List<Integer> arrExtra=new ArrayList<Integer>();

        for(int i=0; i< arr.length; i++) {

            if (i < quotient) {
                arr1.add(arr[i]);
                continue;
            }
            if (i >= quotient  && i < 2*quotient){
                arr2.add(arr[i]);
                continue;
            }
            if (i >= 3* quotient){
                arrExtra.add(arr[i]);
                continue;
            }

            arr3.add(arr[i]);

        }

        for(int no:arr1)
            System.out.print(no + " ");

        System.out.print("\n");

        for(int no:arr2)
            System.out.print(no + " ");

        System.out.print("\n");

        for(int no:arr3)
            System.out.print(no + " ");

        System.out.print("\n");

        for(int no:arrExtra)
            System.out.print(no + " ");
    }
}

