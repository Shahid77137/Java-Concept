import java.util.ArrayList;
import java.util.List;

class Studen{
    private int roll;
    private String name;
    private int marks;
    public Studen() {
    }
    public Studen(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return
                "roll = " + roll +
                        ", name = '" + name +
                        ", marks = " + marks
                ;
    }
}

public class Consumer_Example2 {

    public static void main(String[] args) {

        List<Studen> students = new ArrayList<>();

        students.add(new Studen(10, "name1", 650));
        students.add(new Studen(12, "name2", 750));
        students.add(new Studen(13, "name3", 550));
        students.add(new Studen(14, "name4", 820));
        students.add(new Studen(15, "name5", 720));
        students.add(new Studen(16, "name6", 620));

        students.forEach(s -> System.out.println(s));

    }

}
