package ExceptionHandling;

public class OutOfBoundsExample {

    public static void main(String[] args) {

        int[] nums = new int[] { 1, 2, 3 };

        try {
            int negativeIndex = nums[-1];
            int greaterIndex = nums[4];
            int lengthIndex = nums[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }

        System.out.println("Rest of the code is running.");
    }
}
