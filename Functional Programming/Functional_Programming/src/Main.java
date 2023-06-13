
@FunctionalInterface
interface Intr {

    public void printName();

}

public class Main implements Intr {

    @Override
    public void printName() {
        System.out.println("Hello , I am Shahid Afridi");
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.printName();


    }


}
