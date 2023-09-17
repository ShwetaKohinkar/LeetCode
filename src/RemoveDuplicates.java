import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] strs = {0,0,0,1,1,1,2,2,3,3,4};
        System.out.println( function2(strs));
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


    public static int function2(int[] nums) {
        int count = 0;
        boolean twice = false;
        boolean prevTwice = false;

        for (int i = 1; i< nums.length; i++)
        {
            twice = nums[count] == nums[i];

            if(!twice || !prevTwice)
            {
                nums[count + 1] = nums[i];
                count++;
            }
            prevTwice = twice;
        }
        return count + 1;
    }
}



