package day23;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList();

        int maxLength = String.valueOf(high).length();
        int minLength = String.valueOf(low).length();
        StringBuilder sb = new StringBuilder();

        for (int i = minLength; i <= maxLength; i++) {
            sb = new StringBuilder();
            int startIndexValue = 1;

            int value = startIndexValue;

            while (true) {
                sb.append(String.valueOf(value));
                value++;
                if (Integer.valueOf(sb.toString()) > high) {
                    break;
                }

                if (sb.length() == i) {
                    if (Integer.valueOf(sb.toString()) >= low && Integer.valueOf(sb.toString()) <= high) {
                        ans.add(Integer.valueOf(sb.toString()));
                    }
                    sb = new StringBuilder();
                    startIndexValue = startIndexValue + 1;
                    value = startIndexValue;
                }

                if (startIndexValue > 9 - i + 1) {
                    break;
                }

            }
        }
        return ans;
    }
}
