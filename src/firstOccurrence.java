public class firstOccurrence {

    public static void main(String args[])
    {


        System.out.println( strStr1("sadbutsad", "sad"));

    }
    public static int strStr1(String haystack, String needle) {

            int n = haystack.length();
            int m = needle.length();

            for (int i = 0; i <= n - m; i++) {
                int j =0;
                for (j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                }
                if (j == m)
                    return i;
            }
            return -1;
        }
}