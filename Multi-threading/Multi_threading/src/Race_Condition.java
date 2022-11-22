
class Common {
    public void fun1(String name) {
        System.out.print("Welcome ");
        try {
            Thread.sleep(1000);
        } catch (Exception ee) {
        }
        System.out.println(name+' ');
    }
    // the above method fun1() is supposed to give the output as welcome and after one
    // second print the supplied name.
}

    // Now what will happen if two threads acts on this fun simultaneously.
    class ThreadA extends Thread{
        Common c;
        String name;
        public ThreadA(Common c,String name) {
            this.c=c;
            this.name=name;
        }
        @Override
        public void run() {
            c.fun1(name);
        }
    }
    class ThreadB extends Thread{
        Common c;
        String name;
        public ThreadB(Common c,String name) {
            this.c=c;
            this.name=name;
        }
        @Override
        public void run() {
            c.fun1(name);
        }
    }

public class Race_Condition {

    public static void main(String[] args) {
        Common c=new Common();
//sharing same Common object to two thread
        ThreadA t1=new ThreadA(c,"Ram");
        ThreadB t2=new ThreadB(c,"Shyam");
        t1.start();
        t2.start();
        System.out.println("desired output : "+"Welcome Ram Welcome Shyam");
        System.out.println("your output");
    }

}
