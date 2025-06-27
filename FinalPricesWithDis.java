public class FinalPricesWithDis {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            int dis=0;
            for(int j=i+1;j<n;j++)
            {
            if(prices[j]<=prices[i])
            {
                
                dis=prices[j];
                break;
            }
            }
            result[i]=prices[i]-dis;
        }
       return result;
    }
}
