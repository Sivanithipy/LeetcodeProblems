class coinchange {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] minc = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            minc[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && minc[i - coin] != Integer.MAX_VALUE) {
                    minc[i] = Math.min(minc[i], 1 + minc[i - coin]);
                }
            }
        }

        if (minc[amount] == Integer.MAX_VALUE)
            return -1;
        return minc[amount];
    }
}
