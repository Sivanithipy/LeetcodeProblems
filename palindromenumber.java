class palindromenumber {
  public boolean isPalindrome(int x) {
      int sum=0;
      int temp;
      int r;
      temp=x;
       while(x>0) 
       {
          r=x%10;
          sum=(sum*10)+r;
          x=x/10;
      }
      if(temp==sum)
      {
          return true;
      }
      else{
          return false;
      }
      
 
  }
}