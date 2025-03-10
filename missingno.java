class missingno{
  public int missingNumber(int[] nums) {
      int n=nums.length;
      int t=n*(n+1)/2;
      int a=0;
      for(int i=0;i<n;i++)
      {
          a=a+nums[i];
      }
      return t-a;
  }
}
