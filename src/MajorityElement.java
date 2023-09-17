import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args)
    {
        int[] strs = {3,2,2,3};
        System.out.println( majorityElement(strs));
    }


    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];
    }

}
