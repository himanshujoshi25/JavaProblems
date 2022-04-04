package Java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Names {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("MNO");
        names.add("DEF");
        names.add("ABC");
        names.add("XYZ");
        names.add("JKL");

        List<String> sortedList = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);  //Ascending Order using Comparator

        List<String> sortedList1 = names.stream().sorted((n1,n2) ->n1.compareTo(n2)).collect(Collectors.toList());
        System.out.println(sortedList1); //Ascending Order using lambda expressions

        List<String> sortedList2 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);  //Descending Order using Comparator

        List<String> sortedList3 = names.stream().sorted((n1,n2) ->n2.compareTo(n1)).collect(Collectors.toList());
        System.out.println(sortedList3); //Descending Order using Lambda expressions

        List<Book> books = new ArrayList<>();
        books.add(new Book("One Hundred Years of Solitude",123,1000));
        books.add(new Book("Invisible Man",456,9000));
        books.add(new Book("To Kill a Mockingbird",234,7000));
        books.add(new Book("Sherlock Holmes",150,4000));
        books.add(new Book("The Great Gatsby",12,5000));

        List<Book> sortedByPrice = books.stream().sorted((b1,b2) ->
                (int) (b1.getPrice() - b2.getPrice())).collect(Collectors.toList());

        System.out.println(sortedByPrice);  //Ascending Order by Price using lambda expressions

        List<Book> sortedByDecreasingPrice = books.stream().sorted((b1,b2) ->
                (int) (b2.getPrice() - b1.getPrice())).collect(Collectors.toList());

        System.out.println(sortedByDecreasingPrice);  //Descending Order by Price using lambda expressions

        List<Book> sortedByPrice1 = books.stream().sorted((Comparator.comparingLong(Book::getPrice)))
                .collect(Collectors.toList());

        System.out.println(sortedByPrice1);  //Ascending Order by Price using Comparator

        List<Book> sortedByPrice2 = books.stream().sorted((Comparator.comparingLong(Book::getPrice).reversed()))
                .collect(Collectors.toList());

        System.out.println(sortedByPrice2);  //Descending Order by Price using Comparator
    }
}
