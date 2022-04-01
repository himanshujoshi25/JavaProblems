package JavaPrograms;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        String initial, reverse ="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        initial=in.nextLine();
        int length=initial.length();

        for(int i=length-1;i>=0;i--)
            reverse = reverse +initial.charAt(i);
        System.out.println("Reversed string: "+ reverse);
    }

}
