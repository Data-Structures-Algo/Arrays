//Top Interview 150
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            // If at any point the current gas is negative, reset the starting station
            if (currentGas < 0) {
                startStation = i + 1;
                currentGas = 0; // Reset the current gas to 0 for the next potential start
            }
        }

        // If total gas is less than total cost, it's impossible to complete the circuit
        return totalGas >= totalCost ? startStation : -1;
    }
}
