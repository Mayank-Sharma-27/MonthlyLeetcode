package day20;

public class KoKoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        long totalBananas = 0;
        for (int i : piles) {
            totalBananas += i;
        }

        int max = 0;

        for (int i : piles) {
            max = Math.max(max, i);
        }

        double d = totalBananas / h;
        int minimumSpeed = (int) Math.ceil(d);
        while (minimumSpeed < max) {
            int speed = (minimumSpeed + max) / 2;
            int hoursTaken = 0;
            for (int i = 0; i < piles.length; i++) {
                double q = (double) piles[i] / speed;
                hoursTaken += (int) Math.ceil(q);

            }

            if (hoursTaken <= h) {
                max = speed;
            } else {
                minimumSpeed = speed + 1;
            }


        }
        return max;

    }
}
