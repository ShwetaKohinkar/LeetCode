import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] strs = {0,0,1,1,1,2,2,3,3,4};
        System.out.println( function(strs));
    }


    public static int function(int[] nums) {
        int count = 1;

        for (int i =1; i<nums.length;i++)
        {
            if(nums[count-1] < nums[i] )
            {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
