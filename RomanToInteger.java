import java.util.HashMap;

public class RomanToInteger {
    public static void main(String args[])
    {
        System.out.println(romanToInt("IX"));
    }

        public static int romanToInt(String s) {

            HashMap<Character, Integer> romanInt = new HashMap<>();
            romanInt.put('I',1);
            romanInt.put('V',5);
            romanInt.put('X',10);
            romanInt.put('L',50);
            romanInt.put('C',100);
            romanInt.put('D',500);
            romanInt.put('M',1000);

            int number =0;

            s = s.replace("IV", "IIII").replace("IX", "VIIII");
            s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
            s = s.replace("CD", "CCCC").replace("CM", "DCCCC");

            for (Character ch : s.toCharArray())
            {
                    number+=romanInt.get(ch);
            }

            return number;
//            if(s.contains("V"))
//            {
//                if(s.startsWith("I")) return 4;
//                if(s.startsWith("V"))
//                {
//                    return 5 + countOcc(s,'I');
//                }
//            }
//
//            if(s.contains("X"))
//            {
//                if(s.startsWith("I")) return 9;
//                if(s.startsWith("X"))
//                {
////                    if(countOcc(s,'X')
//                }
//            }
//            if(s.startsWith("I"))
//            {
//                if(countOcc(s,'I') == 1) return 1;
//                if(countOcc(s,'I') == 2) return 2;
//                if(countOcc(s,'I') == 3) return 3;
//            }
//
//
//            if(s.startsWith("L"))
//            {
//
//            } if(s.startsWith("C"))
//            {
//
//            } if(s.startsWith("D"))
//            {
//
//            } if(s.startsWith("M"))
//            {
//
//            }
//            return 0;
//    }
        }

    public int countOcc(String s, char c)
    {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

}
