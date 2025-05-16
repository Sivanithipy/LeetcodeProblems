class lardivsubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];   
        int[] parent = new int[n]; 
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        while (maxIndex >= 0) {
            result.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }

        Collections.reverse(result); 
        return result;
    }
}
