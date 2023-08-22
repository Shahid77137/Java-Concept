
abstract class Abstct{

abstract void absmethod();

public void AgeraRS(){

    System.out.println("Inside abstarct class of normal method");

}


}


class AB extends Abstct{


    @Override
    void absmethod() {
        System.out.println("This is overrideen of abstact method of abstract class");
    }



}


public class Abstraction {

    public static void main(String[] args) {

        AB ab = new AB();
        ab.absmethod();
        ab.AgeraRS();

    }

}
