class happynumber {
  public boolean isHappy(int n) {
      Set<Integer> seen=new HashSet<>();
      while(!seen.contains(n)){
          seen.add(n);
          int sum=0;
          while(n!=0){
              int temp=n%10;
              sum+=temp*temp;
              n=n/10;
          }
          n=sum;
      }
      return n==1;
      
     
  }
}