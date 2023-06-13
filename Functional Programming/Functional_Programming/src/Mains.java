import java.io.*;
 class Person implements Serializable{
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public Person(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
}
public class Mains{
    public static void main(String args[])throws Exception{
        Person s1 =new Person(211,"Shahid",22);//creating object
//writing object into file
        FileOutputStream f=new FileOutputStream("sf.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("success");
    }
}
