package ComparableExample;

public class Student implements Comparable<Student> {

    private String name;
    private int roll_no;
    private int standard;

    public Student(String name, int roll_no, int standard) {
        this.name = name;
        this.roll_no = roll_no;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", standard=" + standard +
                '}';
    }

    @Override
    public int compareTo(Student student2) {
        if (this.getRoll_no() > student2.getRoll_no())
            return 1;
        else
            return -1;
    }
}
