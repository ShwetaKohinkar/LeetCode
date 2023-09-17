public class RotateArray {

    public static void main(String[] args)
    {
        int[] strs = {-1,-100,3,99};
        rotate(strs, 2);
    }
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k-1);

        reverse(nums, k, nums.length -1);

    }
    public static void reverse(int[] nums, int low, int high)
    {
        while(low <= high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;

        }
    }

}
