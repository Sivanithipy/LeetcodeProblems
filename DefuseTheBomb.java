public class DefuseTheBomb {
     public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] a=new int[n];
        if(k==0)
        {
          return a;
        }
        for(int i=0;i<n;i++)
        {
            int sum=0;
            if(k>0)
            {
               for(int j=1;j<=k;j++)
               {
                sum+=code[(i+j)%n];
               }
            }
           else
           {
            for(int j=1;j<=-k;j++)
            {
                sum+=code[(i-j+n)%n];
            }
           }
           a[i]=sum;
        }
        return a;
    }
}
