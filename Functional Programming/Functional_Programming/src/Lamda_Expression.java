@FunctionalInterface
interface Intrface {

    public void printName(String name);

}

public class Lamda_Expression {

    public static void main(String[] args) {

        Intrface intr = name -> {
            System.out.println("Hi , i am "+name);
        };
        intr.printName("Tony Stark");
    }

}
