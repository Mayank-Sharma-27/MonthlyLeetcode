package day2;

import java.util.HashMap;
import java.util.Map;

public class Day2 {
    public int numPairsDivisibleBy60(int[] time) {
        int numberOfPairs = 0;
        int length = time.length;

        int[] arr = new int[length];


        Map<Integer, Integer> map = new HashMap();
        int index = 0;
        for (int i : time) {
            arr[index] = i % 60;
            index++;
            map.put(i % 60, map.getOrDefault(i % 60, 0) + 1);
        }


        for (int i = 0; i < arr.length; i++) {
            int requiredNumber = (60 - arr[i]) % 60;
            if (map.get(requiredNumber) == null) {
                continue;
            }

            if (arr[i] == requiredNumber) {
                map.put(arr[i], map.get(arr[i]) - 1);

                numberOfPairs += map.get(arr[i]);
            } else {
                numberOfPairs += map.get(requiredNumber);
                map.put(arr[i], map.get(arr[i]) - 1);
            }


        }
        return numberOfPairs;
    }
}
