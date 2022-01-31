package day31;

public class Day31 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        int n = accounts[0].length;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
