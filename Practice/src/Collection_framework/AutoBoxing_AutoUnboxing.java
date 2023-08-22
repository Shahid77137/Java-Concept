package Collection_framework;

public class AutoBoxing_AutoUnboxing {

    public static void main(String[] args) {

        int a = 10;
        Integer b = Integer.valueOf(a); // This is AutoBoxing
        System.out.println("After AutoBoxing = " + b);


        int c = b.intValue(); // This is AutoUnboxing
        System.out.println("After AutoUnboxing = " + c);


    }

}
