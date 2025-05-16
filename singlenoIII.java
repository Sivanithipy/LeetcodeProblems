class singlenoIII {
    public int[] singleNumber(int[] nums) {
        if(nums.length<=1)
        {
            return nums;
        }
        Arrays.sort(nums);
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;)
        {
            if(i==nums.length-1||nums[i]!=nums[i+1])
            {
                l.add(nums[i]);
                i++;
            }
            else
            {
                i+=2;
            }
        }
        int[] result=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            result[i]=l.get(i);
        }
        return result;
    }
}