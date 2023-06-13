import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis=new FileInputStream("file1.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object obj=ois.readObject();
        A a1=(A)obj;
        a1.funA();
        String ss=(String)ois.readObject();
        System.out.println(ss);
        int z=(Integer)ois.readObject();
        System.out.println(z);
        ois.close();

    }

}
