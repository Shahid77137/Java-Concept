import java.util.ArrayList;
import java.util.List;

class Students{
    private int roll;
    private String name;
    private int marks;
    public Students() {
    }
    public Students(int roll, String name, int marks) {
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

public class Predicate_Example2 {

    public static void main(String[] args) {

        List<Students> stu = new ArrayList<>();

        stu.add(new Students(10, "name1", 650));
        stu.add(new Students(12, "name2", 750));
        stu.add(new Students(13, "name3", 550));
        stu.add(new Students(14, "name4", 820));
        stu.add(new Students(15, "name5", 720));
        stu.add(new Students(16, "name6", 620));

        System.out.println(stu.removeIf(stude -> stude.getMarks() < 700));

        stu.removeIf(stude -> stude.getMarks() < 700);

        System.out.println(stu);

    }

}
