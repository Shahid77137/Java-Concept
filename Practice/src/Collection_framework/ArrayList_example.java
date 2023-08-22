package Collection_framework;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayList_example {
    public static void main(String[] args) {


//        Collection<Integer> list = new ArrayList<>(); // We don't Collections because it is very less generic

        List<Integer> list = new ArrayList<>();  // We mostly use this List because it is moderatly generic

//        ArrayList<Integer> list = new ArrayList<>();  // We don't use ArrayList because it is most generic

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        list.add(1);
        list.add(null);

        System.out.println("Printing list = " + list);
        System.out.println("Size of list = " + list.size());
        System.out.println("index of element of list = " + list.indexOf(1));
        System.out.println("last index of element of list = " + list.lastIndexOf(1));
        System.out.println("value of the index of list = " + list.get(1));
        System.out.println("removing index of list = " + list.remove(1));
        System.out.println("use of contain method of list = " + list.contains(3));
        System.out.println("Adding a element at a specific position");
        list.add(2,5);
        System.out.println(list);

//        Itertating the list

        System.out.println("Doing with normal for loop");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("Doing with iterator");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            Integer curr = itr.next();
            if (curr == null) {
                itr.remove(); // Safely removes the current element from the list
            }else{
                System.out.print(curr+" ");
            }
        }

        System.out.println();
        System.out.println(list);

    }
}
