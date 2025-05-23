class larnoatleasttwiofoth {
    public int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1, index = -1;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if(nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        
        if(max >= 2 * secondMax) {
            return index;
        } else {
            return -1;
        }
    }
}
