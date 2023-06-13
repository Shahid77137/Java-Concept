import java.io.*;
class Studentss implements Serializable{
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public Studentss(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public void funB(){
        System.out.println("inside funA() of A");
        System.out.println(name+" ");
    }

}

public class Serialization_Transient_Keyword {

    public static void main(String[] args) throws IOException {

        Studentss s1 =new Studentss(211,"ravi",22);//creating object
//writing object into file
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("success");

    }

}
