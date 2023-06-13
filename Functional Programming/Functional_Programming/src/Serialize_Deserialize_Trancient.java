import java.io.*;

class Persons implements Serializable {
     int id;
     String name;
     int age; // Now it will not be serialize
     transient String password;

    public Persons(int id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }
}

public class Serialize_Deserialize_Trancient {
    public static void main(String args[]) throws Exception {
        Persons s1 = new Persons(211, "Shahid", 23, "Shahid1804");

        // Serialize the object and write it to a file
        FileOutputStream f = new FileOutputStream("sf.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Serialization success");

        // Deserialize the object from the file
        FileInputStream fileIn = new FileInputStream("sf.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Persons deserializedPerson = (Persons) in.readObject();
        in.close();
        fileIn.close();

        // Print the deserialized object
        System.out.println("Deserialization success");
        System.out.println("ID: " + deserializedPerson.id);
        System.out.println("Name: " + deserializedPerson.name);
        System.out.println("Age: " + deserializedPerson.age);
        System.out.println("Password: " + deserializedPerson.password);
    }
}
