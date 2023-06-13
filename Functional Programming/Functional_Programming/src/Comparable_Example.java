import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Studtd implements Comparable<Studtd>{
    private int roll;
    private String name;
    private int marks;
    public Studtd() {
    }
    public Studtd(int roll, String name, int marks) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studtd studtd = (Studtd) o;
        return roll == studtd.roll && marks == studtd.marks && Objects.equals(name, studtd.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, marks);
    }

    @Override
    public int compareTo(Studtd o) {

        if(this.marks < o.marks){
            return 1;
        }else if(this.marks > o.marks){
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }

//        return this.marks-o.marks;

    }
}

public class Comparable_Example {

    public static void main(String[] args) {

        List<Studtd> stud = new ArrayList<>();

        stud.add(new Studtd(10,"Max Verstappen",780));
        stud.add(new Studtd(12,"Charles Leclerc",780));
        stud.add(new Studtd(14,"Charlos Sainz",680));
        stud.add(new Studtd(15,"Lewis Hamilton",580));

        Collections.sort(stud);

        stud.forEach(s -> System.out.println(s));

    }

}
