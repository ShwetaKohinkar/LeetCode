public class SerachInsertPosiiton {


    public static void main(String[] args)
    {
        int[] strs = {1,3,5,6};
        System.out.println( searchInsert(strs, 2));
    }


    public static int searchInsert(int[] nums, int target) {


        int low = 0;
        int high = nums.length - 1;
        int res = 0;

        while (low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }

            else if(nums[mid] > target)
            {

                high = mid -1;

            }
            else if(nums[mid] < target)
            {
                low = mid + 1;
            }

        }
        return low;
    }
}
