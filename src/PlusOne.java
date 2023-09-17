public class PlusOne {


    public static void main(String[] args)
    {
        int[] strs = new int[]{9};
        System.out.println( plusOne(strs));
    }
    public static int[] plusOne(int[] digits) {

        for(int i = digits.length -1; i >= 0; i-- )
        {
            if(digits[i]<9)
            {
                digits[i] +=1;
                return digits;
            }
            digits[i] =0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
