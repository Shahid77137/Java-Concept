@FunctionalInterface
interface Intrref{
    void printString();
}


public class Method_Reference_constructor {


    public Method_Reference_constructor() {
        System.out.println("reference to constructor");
    }

    public static void main(String[] args) {

        Intrref mfc = Method_Reference_constructor::new;
        mfc.printString();

    }

}
