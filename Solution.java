public class Solution extends guessnohorl {
    public int guessNumber(int n) 
    {
        int start=1;
        int end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(guess(mid)==0)
            {
                return mid;
            }
            else if(guess(mid)==1)
            {
                start=mid+1;
            }
            else
            {
                end=mid--;
            }
        }
       return -1;
    }
}
 