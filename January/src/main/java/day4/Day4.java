package day4;

public class Day4 {
    //problem link https://leetcode.com/problems/complement-of-base-10-integer/solution/
    public int bitwiseComplement(int n) {
        int i = 0;
        int res = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {

            if (n % 2 == 0)
                res += Math.pow(2, i);
            i++;
            n /= 2;
        }
        return res;

    }
}
