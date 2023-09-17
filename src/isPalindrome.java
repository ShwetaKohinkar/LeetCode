public class isPalindrome {

    public static void main(String args[])
    {


        if(function(-121))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

        public static boolean function(int x) {

            int temp = x, rev =0;

            while(temp!=0)
            {
                int ld = temp%10;
                rev = rev * 10 + ld;
                temp = temp / 10;
            }
            if(x<0 && rev == x)
            {
                return false;
            }
            return (rev == x);
        }
    }
