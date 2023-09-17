public class StringToInteger {

       public static void main(String[] args)
       {
           myAtoi("-91283472332");
       }

        public static int myAtoi(String s) {

            boolean positive = true;
            if(s.length() ==0)
            {
                return 0;
            }
            double finalNum = 0;

            int i=0;
            while(i<s.length()&& s.charAt(i) ==' ')
            {
                i++;
            }
            if(i == s.length())
            {
                return 0;
            }
            if(s.charAt(i) == '-' || s.charAt(i)=='+')
            {
                if(s.charAt(i)=='-') {
                    positive = false;
                }
                i++;
            }

            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                finalNum = finalNum * 10 + (s.charAt(i) - '0');
                i++;
            }

            finalNum = !positive ? -finalNum : finalNum;

            finalNum = finalNum > Integer.MAX_VALUE ? Integer.MAX_VALUE : finalNum;
            finalNum = finalNum < Integer.MIN_VALUE ? Integer.MIN_VALUE : finalNum;

            return (int)finalNum;
        }
}
