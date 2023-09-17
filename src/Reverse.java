import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {


    public static void main(String args[]) {


        System.out.println(reverse(-123));

    }

    public static int reverse(int x) {
        int temp = x;
        int rev = 0;
        int neg = 0;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }

        if (rev < -(1 << 31) || rev > (1 << 31) - 1) {
            return 0;
        }
        return rev;

    }

    class Product {
        int id;
        String name;

        Product(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public class Shop {
        public void main(String[] args) {
            List<Product> Ist = new ArrayList<>();
            Ist.add(new Product(10, "IceCream"));
            Ist.add(new Product(11, "Chocolate"));
            Product p1 = new Product(10, "IceCream");
            System.out.println(Ist.indexOf(p1));
        }
    }
}