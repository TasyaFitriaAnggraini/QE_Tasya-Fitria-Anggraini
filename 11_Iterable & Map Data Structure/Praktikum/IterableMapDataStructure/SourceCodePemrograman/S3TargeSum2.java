import java.util.*;

public class S3TargeSum2 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 11};
        int target = 11;
        int[] result = PairWithTargeSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] PairWithTargeSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
