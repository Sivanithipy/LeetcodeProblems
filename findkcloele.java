class findlcloele{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-k;
        while(l<r)
        {
            int m=(l+r)/2;
            if(x-arr[m]>arr[m+k]-x)
            {
                l=m+1;
            }
            else
            {
                r=m;
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int i=l;i<l+k;i++)
        {
            a.add(arr[i]);
        }
        return a;
    }
}