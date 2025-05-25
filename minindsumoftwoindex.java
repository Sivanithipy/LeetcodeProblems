class minidsumoftwoindex {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        List<String> result=new ArrayList<>();
        int ms=Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++)
        {
            String word=list2[j];
            if(map.containsKey(word))
            {
                int i=map.get(word);
                int sum=i+j;
            
            if(sum<ms)
            {
                result.clear();
                result.add(word);
                ms=sum;
            }
            else if(sum==ms)
            {
                result.add(word);
            }
        }

        }
      return result.toArray(new String[0]);
    }
}