class sumofuniele {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;)
        {
           int count=1;
           while(i+count<nums.length&&nums[i]==nums[i+count])
           {
            count++;
           }
           if(count==1)
           {
            sum+=nums[i];
           }
           i+=count;
        }
        return sum;
    }
}