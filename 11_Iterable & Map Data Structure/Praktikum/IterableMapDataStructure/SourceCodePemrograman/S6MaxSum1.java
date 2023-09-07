import java.util.Arrays;

public class S6MaxSum1 {
    public static int maxSum(int arr[], int n, int k)
    {
        if (n < k)
        {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }
    public static int[] findMaxSubarray(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return new int[0];
        }
        int maxSum = 0;
        int currentSum = 0;
        int start = 0;
        int[] maxSubarray = new int[k];
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            if (end - start + 1 == k) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    System.arraycopy(nums, start, maxSubarray, 0, k);
                }
                currentSum -= nums[start];
                start++;
            }
        }
        return maxSubarray;
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = nums.length;
        int[] maxSubarray = findMaxSubarray(nums, k);
        System.out.println("Output: " + maxSum( nums, n, k));
        System.out.println("Maximum sum: " + Arrays.toString(maxSubarray));
    }
}
