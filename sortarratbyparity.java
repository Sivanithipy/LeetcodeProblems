public class sortarratbyparity {
    public int[] sortArrayByParityII(int[] nums) {
     int n=nums.length;
     int even=0,odd=1;
     int[] res=new int[n];
     for(int num:nums)
     {
        if(num%2==0)
        {
            res[even]=num;
            even+=2;
        }
        else
        {
            res[odd]=num;
            odd+=2;
        }

     }
     return res;
    }
}
