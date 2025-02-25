
class kthMissingPositiveNumber {
  public int findKthPositive(int[] arr, int k) {
      int m=0;
      int j=0;
      
      for(int i=1;i<=2000;i++)
      {
          if(j<arr.length&&arr[j]==i)
          {
            j++;

          }
          else
          {
              m++;
          
        if(m==k)
        {
          return i;
        }
      }
        
      }
      return -1;
  }
} 
  

