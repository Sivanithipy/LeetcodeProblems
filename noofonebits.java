class noofonebits {
  public int hammingWeight(int n) {
      StringBuilder binary=new StringBuilder();
      int count=0;
      while(n!=0)
      {
          count+=n&1;
          n>>>=1;
      }
      return count;
  }
}