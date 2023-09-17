public class RemoveElement
{

    public static void main(String[] args)
    {
        int[] strs = {3,2,2,3};
        System.out.println( removeElement(strs, 3));
    }

    public static int removeElement(int[] nums, int val) {

        int i =0, k= 0;
        int count = 0;
        int arr[] =  new int[nums.length];
        while( i < nums.length )
        {
            if(nums[i] != val)
            {
                nums[k] = nums[i];
                k ++;
            }
            else
                count++;
            i++;
        }
        return nums.length - count;
    }
}
