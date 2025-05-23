class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--)
        {
            List<Integer>cr=triangle.get(i);
            List<Integer>br=triangle.get(i+1);
            for(int j=0;j<cr.size();j++)
            {
                int mb=Math.min(br.get(j),br.get(j+1));
                cr.set(j,cr.get(j)+mb);
            }
        }
       return triangle.get(0).get(0);
    }
}