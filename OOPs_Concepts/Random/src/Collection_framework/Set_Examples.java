package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Examples {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
        System.out.println(set.add(2));
        System.out.println(set.add(4));
        System.out.println(set);
//        set.clear(); // it clears the list
        System.out.println("Printing set = " + set);
        System.out.println("Size of set = " + set.size());
        System.out.println("removing index of set = " + set.remove(1)); // it is removing the element of the set
        System.out.println("use of contain method of set = " + set.contains(3));




        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()){

            Integer curr = itr.next();
            if(curr < 3){
                itr.remove();
            }
            System.out.print(curr+" ");

        }

        System.out.println();
        System.out.println(set);



    }

}
