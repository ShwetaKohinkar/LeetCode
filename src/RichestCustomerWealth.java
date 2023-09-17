public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int amount = 0;
        int prevAmount = 0;

        for (int i = 0; i < accounts.length; i++) {
            amount = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                amount += accounts[i][j];
            }
            if (prevAmount <= amount) {
                prevAmount = amount;
            }
        }
        return prevAmount;

    }
}