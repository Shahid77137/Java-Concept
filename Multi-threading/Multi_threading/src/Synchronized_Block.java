class Ferrari{

    public void print(String name){

        System.out.println("We have number of cars");

        synchronized (this){
            for(int i=1;i<=6;i++){
                System.out.println(i);
                System.out.println("Ready for race at "+name);
            }
        }

        System.out.println("Mission Winnow");
    }

}


class Factory extends Thread{

    Ferrari f;
    String name;

    public Factory(Ferrari f, String name) {
        this.f = f;
        this.name = name;
    }

    @Override
    public void run() {
        f.print(name);
    }
}


public class Synchronized_Block {

    public static void main(String[] args) {

        Ferrari f = new Ferrari();

        Factory t1 = new Factory(f,"Monza");
        Factory t2 = new Factory(f,"Imola");

        t1.start();
        t2.start();

    }

}
