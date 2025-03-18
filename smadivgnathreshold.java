class  smadivgnathreshold  {
  public int smallestDivisor(int[] nums, int threshold) {
      int n=nums.length;
      int maxi=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
      {
          maxi=Math.max(maxi,nums[i]);
      }
      int left=1,right=maxi;
      while(left<=right)
      {
          int mid=left+(right-left)/2;
          int sum=0;
          for(int i=0;i<n;i++)
          {
              sum+=(nums[i]+mid-1)/mid;
          }
          if(sum<=threshold)
          {
              right=mid-1;
          }
          else
          {
              left=mid+1;
          }
      }
      return left;
  }
}
