import java.util.*;

class Studtdt{
    private int roll;
    private String name;
    private int marks;
    public Studtdt() {
    }
    public Studtdt(int roll, String name, int marks) {
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

public class Comparator_Example {

    public static void main(String[] args) {

        List<Studtdt> stud = new ArrayList<>();

        stud.add(new Studtdt(10,"Max Verstappen",880));
        stud.add(new Studtdt(12,"Charles Leclerc",780));
        stud.add(new Studtdt(14,"Charlos Sainz",680));
        stud.add(new Studtdt(15,"Lewis Hamilton",580));

        Collections.sort(stud, new Comparator<Studtdt>() {
            @Override
            public int compare(Studtdt o1, Studtdt o2) {

                return o1.getMarks() - o2.getMarks();
            }
        });

        stud.forEach(s -> System.out.println(s));

        // stud.forEach(System.out::println);

    }

}
