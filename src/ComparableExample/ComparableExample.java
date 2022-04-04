package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("ABC",19,8));
        student.add(new Student("DEF",23,10));
        student.add(new Student("PQR",1,5));
        student.add(new Student("XYZ",15,3));
        Collections.sort(student);

        for (Student s: student){
            System.out.println(s);
        }
    }
}
