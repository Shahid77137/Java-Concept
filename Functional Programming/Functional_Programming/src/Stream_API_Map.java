import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Studtdtst{
    private int roll;
    private String name;
    private int marks;
    public Studtdtst() {
    }
    public Studtdtst(int roll, String name, int marks) {
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


public class Stream_API_Map {

    public static void main(String[] args) {

        List<Studtdtst> students = new ArrayList<>();
        students.add(new Studtdtst(10,"Name1",850));
        students.add(new Studtdtst(12,"Name2",750));
        students.add(new Studtdtst(13,"Name3",650));
        students.add(new Studtdtst(14,"Name4",950));
        students.add(new Studtdtst(15,"Name5",750));

       List list = students.stream().map(s -> "welcome "+s.getName()).collect(Collectors.toList());

       list.forEach(System.out::println);

    }

}
