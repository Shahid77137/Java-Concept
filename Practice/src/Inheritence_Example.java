
class A{

    String name;
    String color;

    public A(String name,String color){
        this.name = name;
        this.color = color;
    }

    public void printName(){
        System.out.println(name);
    }public void printColor(){
        System.out.println(color);
    }
}


class B extends A{

    int seats;
    int bhp;

    public B(String name,String color,int seats,int bhp){
        super(name,color);
        this.seats = seats;
        this.bhp = bhp;
    }

    public void printAll(){
        System.out.println(name+" "+color+" "+seats+" "+bhp);
    }

}



public class Inheritence_Example {

    public static void main(String[] args) {

        B b = new B("Ferrari","Rosso Scuderia",2,986);
        b.printName();
        b.printColor();
        b.printAll();
    }

}
