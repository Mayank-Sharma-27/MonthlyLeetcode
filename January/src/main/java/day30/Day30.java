package day30;

public class Day30 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int end = nums.length - 1;
        reverse(nums, 0, end);
        reverse(nums, 0, k - 1);
        reverse(nums, k, end);

    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
