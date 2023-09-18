import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CreateTargetArray {

    public static void main(String[] args)
    {
        int[] nums = {0,1,2,3,4};
        int[] index =  {0,1,2,2,1};
        createTargetArray(nums, index);

    }


    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            temp.add(index[i], nums[i]);
        }
        for(int i = 0; i< nums.length; i++){
            target[i] = temp.get(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1,2,3));
        return target;
    }

}
