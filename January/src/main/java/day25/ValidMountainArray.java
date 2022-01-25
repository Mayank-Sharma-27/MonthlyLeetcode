package day25;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (start < arr.length - 1 && arr[start] < arr[start + 1]) {
                start++;
            } else if (end - 1 >= 0 && arr[end - 1] > arr[end]) {
                end--;
            } else {
                break;
            }

        }
        if (start == arr.length - 1 || end == 0) {
            return false;
        }

        return start == end;
    }
}
