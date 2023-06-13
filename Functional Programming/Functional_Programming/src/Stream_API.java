import java.util.ArrayList;
import java.util.List;

class Studtdts{
    private int roll;
    private String name;
    private int marks;
    public Studtdts() {
    }
    public Studtdts(int roll, String name, int marks) {
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


public class Stream_API {

    public static void main(String[] args) {

        List<Studtdts> students = new ArrayList<>();
        students.add(new Studtdts(10,"Name1",850));
        students.add(new Studtdts(12,"Name2",750));
        students.add(new Studtdts(13,"Name3",650));
        students.add(new Studtdts(14,"Name4",950));
        students.add(new Studtdts(15,"Name5",750));

        students.stream().filter(s -> s.getMarks() > 800).forEach(System.out::println);

    }

}
