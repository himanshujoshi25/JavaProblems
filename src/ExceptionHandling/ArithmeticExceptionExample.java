package ExceptionHandling;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        try {
            int result = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        }
        System.out.println("Rest of the code is running.");
    }
}
