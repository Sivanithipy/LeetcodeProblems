class largestnum  {
  public String largestNumber(int[] nums) {
      String[] strNums=new String[nums.length];
      for(int i=0;i<nums.length;i++)
      {
          strNums[i]=String.valueOf(nums[i]);
      }
      Arrays.sort(strNums,new Comparator<String>()
      {
          public int compare(String a,String b)
          {
              String order1=a+b;
              String order2=b+a;
              return order2.compareTo(order1);
          }
      });
      if(strNums[0].equals("0"))
      {
          return "0";
      }
      StringBuilder largestNumber=new StringBuilder();
      for(String num:strNums)
      {
          largestNumber.append(num);
      }
      return largestNumber.toString();
  }
}
