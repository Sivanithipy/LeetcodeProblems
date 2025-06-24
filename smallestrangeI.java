public class smallestrangeI {
    public int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int num:nums)
        {
            if(num>max)max=num;
            if(num<min)min=num;
            
        }
        return Math.max(0,(max-min)-2*k);
    }
}
