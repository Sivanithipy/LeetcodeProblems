class plusOne {
  public int[] plusOne(int[] digits)
   {
      int count=digits.length;
      for(int i=count-1;i>=0;--i){
      digits[i]++;
      digits[i]%=10;
      if(digits[i]!=0){
          return digits;
      }
     
      }
      int[] result=new int[count+1];
      result[0]=1;
      return result;
             
   }
  
}