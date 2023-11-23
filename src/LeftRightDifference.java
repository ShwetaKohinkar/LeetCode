
public class LeftRightDifference {

    public static void main(String[] args)
    {
        int[] strs = new int[]{8,5,2,1,3,4};
        leftRightDifference(strs);

    }
    public static int[] leftRightDifference(int[] nums) {



        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];
        leftSum[0] = rightSum[n-1] = 0;
        for(int i =0; i< n - 1; i++)
        {
            leftSum[i+1] = leftSum[i] + nums[i];
        }
        for(int i =n-1; i > 0; i--)
        {
            rightSum[i-1] = rightSum[i] + nums[i];
        }
        for(int i =0; i< n; i++)
        {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;

    }
}
