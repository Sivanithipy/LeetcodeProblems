class findallnodisappinanarr {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        boolean[] seen = new boolean[nums.length + 1];
        for(int num:nums)
        {
            seen[num]=true;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!seen[i])
            {
                li.add(i);
            }
        }
        return li;
    }
}