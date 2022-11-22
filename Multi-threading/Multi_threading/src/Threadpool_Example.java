import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;

    public PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" job started by "+Thread.currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println(name+" job ended by "+Thread.currentThread().getName());
    }
}


public class Threadpool_Example {

    public static void main(String[] args) {

        PrintJob[] jobs={
                new PrintJob("Ram"),
                new PrintJob("Ravi"),
                new PrintJob("Anil"),
                new PrintJob("Shiva"),
                new PrintJob("Pawan"),
                new PrintJob("Suresh")
        };


        ExecutorService service = Executors.newFixedThreadPool(3);

        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }

}
