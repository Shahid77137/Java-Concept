

class TA implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside class A");

        for(int i=1;i<=8;i++){
            String str = Thread.currentThread().getName();
            System.out.println(str+ " is running");
        }
    }
}

class TB implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside class B");
        for(int i=1;i<=8;i++){
            String str = Thread.currentThread().getName();
            System.out.println(str+ " is running");
        }
    }
}

class TC extends Thread{

    @Override
    public void run() {
        System.out.println("Inside class C");
        for(int i=1;i<=8;i++){
            String str = Thread.currentThread().getName();
            System.out.println(str+ " is running");
        }
    }

}

class TD extends Thread{

    @Override
    public void run() {
        System.out.println("Inside class D");
        for(int i=1;i<=8;i++){
            String str = Thread.currentThread().getName();
            System.out.println(str+ " is running");
        }
    }

}

public class Thread_Name_Change {

    public static void main(String[] args) {
        System.out.println("Inside main method");
        TA a = new TA();
        Thread th_A = new Thread(a);
        TB b = new TB();
        Thread th_B = new Thread(b);
        TC c = new TC();
        TD d = new TD();

        th_A.setName("Nabnit Mondal");
        th_B.setName("Lahiri");
        c.setName("Akshay");
        d.setName("Amit");

        th_A.start();
        th_B.start();
        c.start();
        d.start();
        System.out.println(Thread.currentThread().getName());
    }

}
