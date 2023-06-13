import java.util.function.Function;

public class Function_Example {

    public static void main(String[] args) {
        Function<Integer,String> f = i -> "This is a numner "+i;
        System.out.println(f.apply(10));
    }

}
