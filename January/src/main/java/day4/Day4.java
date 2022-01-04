package day4;

public class Day4 {
    //problem link https://leetcode.com/problems/complement-of-base-10-integer/solution/
    public int bitwiseComplement(int n) {
        int c =1;
        while (c < n) c = (c << 1) + 1;
        return n ^ c;

    }
}
