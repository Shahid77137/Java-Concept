class Table{

    public synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

}

class TableThread1 extends Thread{

    Table t;

    public TableThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class TableThread2 extends Thread{

    Table t;

    public TableThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(6);
    }
}



public class Synchronized_Method {

    public static void main(String[] args) {

        Table table = new Table();

        TableThread1 table1 = new TableThread1(table);
        TableThread2 table2 = new TableThread2(table);

        table1.start();
        table2.start();


    }

}
