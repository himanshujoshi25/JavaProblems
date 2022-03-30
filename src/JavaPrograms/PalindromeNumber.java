package JavaPrograms;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 1221, reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        }
        else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }
    }
}
