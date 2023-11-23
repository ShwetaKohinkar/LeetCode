import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {

    public static void main(String[] args)
    {
        int[] encoded = {1,2,3,4};

        decompressRLElist(encoded);

    }
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < nums.length - 1; i = i+2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int k = 0; k<freq; k++){
                temp.add( val);
            }
        }
        return null;
}
}
