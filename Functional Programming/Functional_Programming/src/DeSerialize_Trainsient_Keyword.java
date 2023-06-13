import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize_Trainsient_Keyword {

    public static void main(String[] args) throws IOException,ClassNotFoundException {

        FileInputStream fis = new FileInputStream("f.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj=ois.readObject();

        Studentss st = (Studentss)obj;
        st.funB();

    }

}
