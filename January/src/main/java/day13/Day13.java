package day13;

import java.util.Arrays;

public class Day13 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int[] p = points[0];
        int ans =1;
        for(int i =1; i < points.length; i++){
            if(p[1] >= points[i][0]){
                p[1] = Math.min(p[1], points[i][1]);
            }
            else{
                ans++;
                p = points[i];
            }
        }
        return ans;
    }
}
