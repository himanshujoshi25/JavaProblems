package JavaPrograms;

public class ArmStrongNumber {

    public static void main(String[] args) {

        int n = 370;
        int temp = n;
        int r;
        int sum=0;

        while (n>0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }

        if(temp == sum)
            System.out.println("It's an Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
