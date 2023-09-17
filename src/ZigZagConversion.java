import java.util.Arrays;

public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        System.out.println(convert(s, 4));
    }

    public static String convert(String s, int numRows) {


        String arr[] = new String[numRows];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        while (k < s.length()) {
            for (int i = 0; i < numRows && k < s.length(); i++) {
                arr[i] += s.charAt(k);
                k++;
            }
            for (int j = numRows - 2; j > 0 && k < s.length(); j--) {
                arr[j] += s.charAt(k);
                k++;
            }
        }

        String temp = "";
        for (String c : arr) {
            temp += c;
        }
        return temp;
    }
}

