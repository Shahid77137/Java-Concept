import java.util.function.Consumer;

class Studs{
    private int roll;
    private String name;
    private int marks;
    public Studs() {
    }
    public Studs(int roll, String name, int marks) {
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
public class Consumer_Example {

    public static void main(String[] args) {

        Consumer<Studs> c = s -> {
            System.out.println("Name : "+s.getName());
            System.out.println("Roll : "+s.getRoll());
            System.out.println("Marks : "+s.getMarks());
        };

        c.accept(new Studs(1,"Shahid Afridi",100));

    }

}
