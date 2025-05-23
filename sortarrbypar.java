class sortarrbypar {
    public int[] sortArrayByParity(int[] nums) {
        int[] r=new int[nums.length];
        int s=0;
        int e=nums.length-1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                r[s++]=num;
            }
            else
            {

                r[e--]=num;
            }
        }
        return r;
    }
}