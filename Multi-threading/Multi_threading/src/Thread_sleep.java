class Sleep_A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside run " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end of run()...");
    }
}

public class Thread_sleep {

    public static void main(String[] args) {

        Sleep_A sa = new Sleep_A();
        Thread t1 = new Thread(sa);
        t1.start();


    }

}
