// 1672. Richest Customer Wealth

public class CustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } }; //answer 6
        int[][] accounts2 = {{1,5},{7,3},{3,5}}; //answer 10
        
        
        int ans1 = maximumWealth(accounts);
        System.out.println(ans1);


        int ans2 = maximumWealth(accounts2);
        System.out.println(ans2);

    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }

            if (sum > max) {
                max = sum;
            }

        }

        return max;

    }

}
