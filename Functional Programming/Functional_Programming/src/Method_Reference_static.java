@FunctionalInterface
interface Intrr{
    int convertToNumber(String number);
}

public class Method_Reference_static {


    public static void main(String[] args) {

//       Syntex = ClassName::methodName

        Intrr itr = Integer::parseInt;
        System.out.println("Converting to number "+itr.convertToNumber("007"));
    }

}
