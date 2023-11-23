import java.util.Arrays;

public class ThreeSumclosest {
    public static void main(String[] args)
    {
        int[] strs = {0,1,2};
        threeSumClosest(strs, 0);
    }
    public static int threeSumClosest(int[] nums, int target) {
        int res = -100000;
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < len - 2; i++){
            int j = i + 1;
            int k = len - 1;

            while(j<k){
                int total = nums[i] + nums[j] + nums[k];
                res = Math.abs(total - target) <= Math.abs(res - target) ? total : res;
                if(total < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return res;
    }
}
