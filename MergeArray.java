import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
       /* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].*/
        int [] array1 = {1,2,3,0,0,0};
        int [] array2 = {2,5,6};
        int m = 3;
        int n = 3;
        //int [] array1 = {0};
        //int [] array2 = {1};
       // int m = 0;
        // int n = 1;

        merge(array1, m, array2, n);


    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = n - 1;
        int i = m - 1;
        while (i >= 0 && index >= 0) {
            if (nums2[index] >= nums1[i]) {
                nums1[i + index + 1] = nums2[index];
                index--;
            } else {
                nums1[i + index + 1] = nums1[i];
                i--;
            }
        }
        //Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        return nums1;
    }
}
