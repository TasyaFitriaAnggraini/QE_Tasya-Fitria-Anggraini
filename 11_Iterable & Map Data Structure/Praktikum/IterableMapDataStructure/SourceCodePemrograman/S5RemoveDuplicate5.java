import java.util.Arrays;

public class S5RemoveDuplicate5 {
    public static int removeDuplicate(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];

        return j;
    }

    public static void main(String[] args) {
        int a[] = {2, 2, 2, 11};
        System.out.println("Input: " + Arrays.toString(a));

        int n = a.length;
        n = removeDuplicate(a, n);


        System.out.println("Output: " + n);
        int[] uniqueNums = new int[n];
        for (int i = 0; i < n; i++) {
            uniqueNums[i] = a[i];
        }
        System.out.print("Element After Removing the Duplicate: ");
        System.out.println(Arrays.toString(uniqueNums));
    }
}
