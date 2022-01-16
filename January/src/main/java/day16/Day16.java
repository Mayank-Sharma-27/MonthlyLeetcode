package day16;

public class Day16 {

    public int maxDistToClosest(int[] seats) {
        int[] left = new int[seats.length];
        int[] right = new int[seats.length];
        int n = seats.length;

        left[0] = 0;
        for(int i =1; i< seats.length; i++){

            if( seats[i] ==0){
                left[i] = left[i-1] +1;
            }
            else {
                left[i] =0;
            }

        }
        right[seats.length - 1] = 0;
        for(int i =seats.length -2; i>=0; i--){

            if( seats[i] ==0){
                right[i] = right[i+1] +1;
            }
            else {
                right[i] =0;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i =0; i < seats.length; i++){
            if(seats[i] ==1){
                continue;
            }
            if(i==0){
                max =  Math.max(max, right[i]);
            }
            else if(i == seats.length -1){
                max =  Math.max(max,  left[i]);
            }
            else {
                max = Math.max(max, Math.min(right[i] , left[i]));
            }
        }
        return max;
    }

}
