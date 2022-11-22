class JoinA implements Runnable {
    int sum;
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("inside A thread");
            sum = sum + i;
        }
    }
}


public class Thread_Join_function {

    public static void main(String[] args) throws InterruptedException {

        JoinA ja = new JoinA();
        Thread th1 = new Thread(ja);
        th1.start();
        th1.join();
        int result = ja.sum;

            System.out.println("inside main thread....");
            System.out.println(result);


    }

}
