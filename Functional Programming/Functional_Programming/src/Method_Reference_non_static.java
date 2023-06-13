
@FunctionalInterface
interface Intrre{
    void printNumber(int number);
}


public class Method_Reference_non_static {

    public void fun1(int num){
        System.out.println("Printing the number "+num);
    }

    public static void main(String[] args) {
        Intrre i1 = new Method_Reference_non_static()::fun1;
        i1.printNumber(12);

    }

}
