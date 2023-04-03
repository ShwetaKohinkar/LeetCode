import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        System.out.println( function(strs));
    }

    public static String function(String[] strs) {
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int count = 0;

        while (count < s1.length() && count < s2.length()) {
            if (s1.charAt(count) == s2.charAt(count)) {
                count++;
            } else {
                break;
            }
        }
        return s1.substring(0, count);
    }
}
