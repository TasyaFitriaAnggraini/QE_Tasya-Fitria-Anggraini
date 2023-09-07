import java.util.*;

public class S1MergeArrays1 {
    public static void main(String[] args){
        List<String> arr1 = new ArrayList<>(Arrays.asList("kazuya", "jin", "lee"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("kazuya", "feng"));

        arr1.addAll(arr2);

        System.out.println(arr1);
    }
}
