import java.util.function.Supplier;

class Studt{
    private int roll;
    private String name;
    private int marks;
    public Studt() {
    }
    public Studt(int roll, String name, int marks) {
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


public class Supplier_Example {

    public static void main(String[] args) {

        Supplier<Studt> st = () -> new Studt(007,"James Bond",700);
        System.out.println(st.get());
    }

}
