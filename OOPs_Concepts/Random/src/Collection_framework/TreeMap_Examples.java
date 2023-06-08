package Collection_framework;

import java.util.*;

public class TreeMap_Examples {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        map.put("Horsepower", 986);
        map.put("Seats", 2);
        map.put("Torque", 800);
        map.put("Turbo", 2);
        map.put("Cylinders", 8);
        map.put("Cubic Capacity", 4000);

        System.out.println("Printing TreeMap Below");
        System.out.println(map);

        System.out.println();

        Map<String, Integer> hashmap = new HashMap<>();

        hashmap.put("Horsepower", 820);
        hashmap.put("Seats", 2);
        hashmap.put("Torque", 800);
        hashmap.put("Turbo", 2);
        hashmap.put("Cylinders", 12);
        hashmap.put("Cubic Capacity", 6500);

        System.out.println("Printing HashMap Below");
        System.out.println(hashmap);


        System.out.println();

        Map<String, Integer> linkedhashmap = new LinkedHashMap<>();

        linkedhashmap.put("Horsepower", 820);
        linkedhashmap.put("Seats", 2);
        linkedhashmap.put("Torque", 800);
        linkedhashmap.put("Turbo", 2);
        linkedhashmap.put("Cylinders", 12);
        linkedhashmap.put("Cubic Capacity", 6500);

        System.out.println("Printing linkedhashmap Below");
        System.out.println(linkedhashmap);

// with the help of this method cann't iterate key or value
        //        for(int i=0;i<linkedhashmap.size();i++){
//            System.out.println(linkedhashmap.get());
//        }


        // 1st method to iterate
        for(Map.Entry<String,Integer> temp:linkedhashmap.entrySet()){
            System.out.println(temp);
        }

        System.out.println();


        // 2nd method to iterate
        Iterator<Map.Entry<String,Integer>> itrmap = linkedhashmap.entrySet().iterator();
        while(itrmap.hasNext()){
            Map.Entry<String,Integer> currele = itrmap.next();
            System.out.println(currele+" ");
        }


        System.out.println();

        // 3rd method to iterate
        Set<Map.Entry<String,Integer>> setmap = linkedhashmap.entrySet();
        for(Map.Entry<String,Integer> temp:setmap){
            System.out.println(temp);
        }
    }

}
