package JavaPrograms;

public class SwapTwoNumbers {

    public static void main(String[] args)
    {
        int temp;
        int x = 100;
        int y = 200;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x + " and y = " + y);
    }
}
