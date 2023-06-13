import java.io.*;

class A implements Serializable {
    int i=10;
    public void funA(){
        System.out.println("inside funA() of A");
        System.out.println(i);
    }
}

public class Serialization {

    public static void main(String[] args) throws IOException {

        A a1=new A();
        a1.i=22; //change the state of a1 object
        FileOutputStream fos=new FileOutputStream("file1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.writeObject("Welcome");//String class object
        oos.writeObject(10); //autoboxing
        oos.close();
        System.out.println("a1 object is serailized");

    }

}
