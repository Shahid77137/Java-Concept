package Collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Collections_framwork {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("C");
        myList.add("A");
        myList.add("B");

        Collections.sort(myList); // Sorts the list
        System.out.println(myList);

        Collections.reverse(myList);
        System.out.println(myList);

        Collections.shuffle(myList); // Shuffles the elements randomly
        System.out.println(myList);


    }

}
