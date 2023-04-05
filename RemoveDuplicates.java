import java.util.Arrays;

public class RemoveDuplicates {
    static int[] expectedNums=null;

    public static void main(String[] args)
    {
        int[] strs = {0,0,1,1,1,2,2,3,3,4};
        System.out.println( function(strs));

        for(int arr : expectedNums)
        {
            System.out.println( arr);

        }
    }


    public static int function(int[] nums) {
        // Arrays.stream(nums).distinct().count();
        expectedNums = new int[nums.length];
        int count = 0;

        for (int i =0; i<nums.length;i++)
        {
            if(i > 0 && nums[count-1] < nums[i] )
            {
                expectedNums[count] = nums[i];
                count++;
            }
            else if(i==0)
            {
                expectedNums[0] = nums[i];
                count++;
            }
        }

        return count;
    }
}
