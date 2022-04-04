package ComparatorExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Laptop> laptop = new ArrayList<>();
        laptop.add(new Laptop("HP",16,70000));
        laptop.add(new Laptop("Asus",8,50000));
        laptop.add(new Laptop("Apple",4,40000));
        Comparator<Laptop> comparator = new Comparator<Laptop>()
        {
            public int compare(Laptop laptop1, Laptop laptop2)
            {
                if(laptop1.getPrice() > laptop2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(laptop,comparator);
        for (Laptop l: laptop){
            System.out.println(l);
        }
    }
}
