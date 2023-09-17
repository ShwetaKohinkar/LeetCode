import java.util.ArrayList;
import java.util.List;

public class concatenateArrays {
    public static void main(String[] args)
    {
        int[] strs = {1,2,1};
        System.out.println( getConcatenation(strs));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n*2];
        //temp = nums;
        for(int i = 0; i<(n*2); i++)
        {
            if(i<n) {
                temp[i] = nums[i];
            }
            else
            {
                temp[i] = nums[i-n];

            }
        }
        return temp;
    }

}
