import java.util.*;

public class S1MergeArrays2 {
    public static void main(String[] args){
        List<String> arr1 = new ArrayList<>(Arrays.asList("lee", "jin"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("kazuya", "panda"));

        arr1.addAll(arr2);

        System.out.println(arr1);
    }
}
