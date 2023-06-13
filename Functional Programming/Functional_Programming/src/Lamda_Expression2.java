import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    private int roll;
    private String name;
    private int marks;
    public Student() {
    }
    public Student(int roll, String name, int marks) {
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

public class Lamda_Expression2 {

    public static void main(String[] args) {

        List<Student> stud = new ArrayList<>();

        stud.add(new Student(10,"name1",780));
        stud.add(new Student(12,"name2",480));
        stud.add(new Student(14,"name3",680));
        stud.add(new Student(15,"name4",580));

        Collections.sort(stud,(s1,s2) -> s1.getMarks() - s2.getMarks());

        for(Student temp:stud){
            System.out.println(temp.getName()+" "+temp.getMarks());
        }

        System.out.println(stud);
    }

}
