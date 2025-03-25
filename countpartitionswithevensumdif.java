class countpartitionswithevensumdif  {
  public int countPartitions(int[] nums) {
      int c=0;
      int t=0;
      for(int i=0;i<nums.length;i++)
      {
          t+=nums[i];
      }
      int ls=0;
      for(int i=0;i<nums.length-1;i++)
      {
          ls+=nums[i];
          if((ls-(t-ls))%2==0)
          {
             c++;
          }
      }
      return c;
  }
}
