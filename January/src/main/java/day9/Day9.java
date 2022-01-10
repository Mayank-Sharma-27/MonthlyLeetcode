package day9;

public class Day9 {
    public boolean isRobotBounded(String instructions) {
        boolean up = true;
        boolean down = false;
        boolean left = false;
        boolean right = false;


        int n = instructions.length();
        int x = 0;
        int y = 0;
        int start = 0;

        while (true) {
            if (start == n) {
                if (x == 0 && y == 0) {
                    return true;
                }
                if (!up) {
                    return true;
                }
                break;
            }
            char c = instructions.charAt(start);
            if (c == 'G') {
                if (up) {
                    y = y + 1;
                } else if (down) {
                    y = y - 1;
                } else if (left) {
                    x = x - 1;
                } else if (right) {
                    x = x + 1;
                }
            } else if (c == 'L') {
                if (up) {
                    up = false;
                    left = true;
                } else if (left) {
                    left = false;
                    down = true;
                } else if (down) {
                    down = false;
                    right = true;
                } else if (right) {
                    right = false;
                    up = true;
                }
            } else if (c == 'R') {
                if (up) {
                    up = false;
                    right = true;
                } else if (left) {
                    left = false;
                    up = true;
                } else if (down) {
                    down = false;
                    left = true;
                } else if (right) {
                    right = false;
                    down = true;
                }
            }
            start++;
        }


        return false;

    }
}
