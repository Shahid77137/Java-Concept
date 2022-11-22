
class A implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside class A");

        for(int i=1;i<=8;i++){
            System.out.println("Audi A"+i);
        }
    }
}

class B implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside class B");
        for(int i=1;i<=8;i++){
            System.out.println("WRC "+i);
        }
    }
}

class C extends Thread{

    @Override
    public void run() {
        System.out.println("Inside class C");
        for(int i=1;i<=8;i++){
            System.out.println("LCA - "+i);
        }
    }

}

class D extends Thread{

    @Override
    public void run() {
        System.out.println("Inside class D");
        for(int i=1;i<=8;i++){
            System.out.println("BMW M"+i);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("Inside main method");
        A a = new A();
        Thread th_A = new Thread(a);
        B b = new B();
        Thread th_B = new Thread(b);
        C c = new C();
        D d = new D();

        th_A.start();
        th_B.start();
        c.start();
        d.start();
        System.out.println("End of main method");
        }
    }
