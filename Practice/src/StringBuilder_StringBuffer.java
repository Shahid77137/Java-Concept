import java.util.Arrays;

public class StringBuilder_StringBuffer {


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("FireExtinguishingTechnologies");
        // sb.setCharAt(26,'i'); // changeing a particular character at any index
        // sb.append("es"); // adding extra string at the end
        // sb.deleteCharAt(4); // deleting a particular character at any index
        // sb.insert(3,'e'); // adding a extra character at any index
        // sb.delete(4,29); // deleting from start index to end index
        // sb.reverse();
        System.out.println("String = " + sb + " length = " + sb.length() + " Capacity = " + sb.capacity());

        int[] arr = {1,2,3,4,5};
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
        int[] arr2 = new int[arr.length+5];
        System.out.println(Arrays.toString(arr2));
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
