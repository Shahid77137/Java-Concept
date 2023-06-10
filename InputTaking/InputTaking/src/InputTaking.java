import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write the values");

        System.out.println("Write the byte value");
        byte value1 = sc.nextByte();
        System.out.println("Write the short value");
        short value2 = sc.nextShort();
        System.out.println("Write the int value");
        int value3 = sc.nextInt();
        System.out.println("Write the long value");
        long value4 = sc.nextLong();
        System.out.println("Write the float value");
        float value5 = sc.nextFloat();
        System.out.println("Write the double value");
        double value6 = sc.nextDouble();
        System.out.println("Write the boolean value");
        boolean value7 = sc.nextBoolean();

//        long value = Long.parseLong(sc.nextLine());

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
    }
}
