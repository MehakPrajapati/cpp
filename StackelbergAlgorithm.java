// Input:
// - L[]: List of leader strategies
// - F[]: List of follower strategies
// - U_L[l][f]: Payoff matrix for leader
// - U_F[l][f]: Payoff matrix for follower

// Output:
// - Best leader strategy l*
// - Corresponding follower response f*

public class StackelbergAlgorithm {

    public static void main(String[] args) {
        String[] L = {"L1", "L2"}; // Leader strategies
        String[] F = {"F1", "F2"}; // Follower strategies

        int[][] U_L = {
            {5, 2},   // Leader payoff: U_L[L1][F1], U_L[L1][F2]
            {1, 4}    // Leader payoff: U_L[L2][F1], U_L[L2][F2]
        };

        int[][] U_F = {
            {3, 6},   // Follower payoff: U_F[L1][F1], U_F[L1][F2]
            {4, 2}    // Follower payoff: U_F[L2][F1], U_F[L2][F2]
        };

        // Step 1: Initialize variables to store best strategy
        int maxLeaderPayoff = Integer.MIN_VALUE;
        String bestLeader = "";
        String bestFollower = "";

        // Step 2: Loop through each leader strategy
        for (int i = 0; i < L.length; i++) {
            int bestFollowerIndex = 0;
            int maxFollowerPayoff = Integer.MIN_VALUE;

            // Step 3: For each leader strategy, find follower's best response
            for (int j = 0; j < F.length; j++) {
                if (U_F[i][j] > maxFollowerPayoff) {
                    maxFollowerPayoff = U_F[i][j];
                    bestFollowerIndex = j;
                }
            }

            // Step 4: Evaluate leader's payoff for that response
            int leaderPayoff = U_L[i][bestFollowerIndex];

            // Step 5: Track the best leader strategy
            if (leaderPayoff > maxLeaderPayoff) {
                maxLeaderPayoff = leaderPayoff;
                bestLeader = L[i];
                bestFollower = F[bestFollowerIndex];
            }
        }

        // Step 6: Output result
        System.out.println("Best Leader Strategy: " + bestLeader);
        System.out.println("Follower's Best Response: " + bestFollower);
        System.out.println("Leader's Payoff: " + maxLeaderPayoff);
    }
}

