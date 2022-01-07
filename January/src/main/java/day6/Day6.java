package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day6 {
    public boolean carPooling(int[][] trips, int capacity) {

        Arrays.sort(trips, new Comparator<int[]>(){
            public int compare(int[] i1, int[] i2) {
                return i1[1] - i2[1];
            }
        });

        Queue<int[]> theQueue = new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[] t1, int[] t2) {
                return t1[2] - t2[2];
            }
        });

        for (int i = 0; i < trips.length; i++) {
            while (!theQueue.isEmpty() && theQueue.peek()[2] <= trips[i][1]) {
                capacity += theQueue.peek()[0];
                theQueue.poll();
            }

            capacity -= trips[i][0];
            theQueue.offer(trips[i]);
            if( capacity < 0 )
                return false;
        }
        return true;

    }
}
