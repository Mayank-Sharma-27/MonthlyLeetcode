package day21;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasInTank = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGasInTank += gas[i] - cost[i];
        }

        if (totalGasInTank < 0) {
            return -1;
        }

        int currentTank = 0;
        int ans = 0;
        for (int i = 0; i < gas.length; i++) {
            currentTank += gas[i] - cost[i];

            if (currentTank < 0) {
                ans = i + 1;
                currentTank = 0;
            }
        }
        return ans;
    }
}
