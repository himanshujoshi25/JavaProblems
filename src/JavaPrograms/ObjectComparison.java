package JavaPrograms;

public class ObjectComparison {

    public static void main(String[] args)
    {
        Double x = new Double(123.4694);

        Long y = new Long(986725144);

        System.out.println("Objects are not equal, hence it returns " + x.equals(y));
        System.out.println("Objects are equal, hence it returns " + x.equals(123.4694));
    }
}
