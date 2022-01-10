package day10;

public class Day10 {

    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int carry = 0;
        int indexA = lengthA - 1;
        int indexB = lengthB - 1;
        String res = "";
        while (indexA >= 0 || indexB >= 0) {
            int valueA = indexA >= 0 ? Integer.parseInt(a.substring(indexA, indexA + 1)) : 0;
            int valueB = indexB >= 0 ? Integer.parseInt(b.substring(indexB, indexB + 1)) : 0;

            int sum = (valueA + valueB + carry) % 2;
            carry = (valueA + valueB + carry) / 2;
            res = sum + res;
            indexA--;
            indexB--;
        }

        if (carry > 0) {
            res = carry + res;
        }
        return res;
    }

}
