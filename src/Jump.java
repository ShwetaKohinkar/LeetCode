public class Jump {
    public static void main(String[] args)
    {
        int[] encoded = {3,2,1,0,4};

        canJump(encoded);

    }
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
