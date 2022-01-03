package day3;

public class Day3 {
    public int findJudge(int n, int[][] trust) {
        int numberOfPeople = -1;

        if (n == 1 && trust.length == 0) {
            return 1;
        }

        int[] inDegress = new int[n + 1];

        int[] outDegrees = new int[n + 1];

        for (int[] arr : trust) {
            inDegress[arr[1]]++;
            outDegrees[arr[0]]++;
        }


        for (int[] arr : trust) {
            if (inDegress[arr[1]] == n - 1 && outDegrees[arr[1]] == 0) {
                return arr[1];
            }
        }
        return -1;
    }
}
