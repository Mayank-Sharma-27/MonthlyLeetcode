package day6;

public class Day6 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] count = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            count[trips[i][1]] += trips[i][0];
            count[trips[i][2]] -= trips[i][0];
        }

        int curr = 0;
        for (int i : count) {
            curr += i;
            if (curr > capacity) {
                return false;
            }
        }

        return true;
    }
}
