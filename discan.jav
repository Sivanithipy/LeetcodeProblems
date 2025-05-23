class discan {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int a=n/2;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(candyType[i]);
        }
       return Math.min(s.size(),a);
    }
}