class countgoodnos  {
  public int countGoodNumbers(long n) {
      long even=(n+1)/2;
      long odd=n/2;
      long mod=1000000007;
      long a = modPow(5, even, mod);
      long b = modPow(4, odd, mod);
      
      return (int)((a * b) % mod);
  }
   public long modPow(long base, long exp, long mod) {
      long result = 1;
      base = base % mod;
      
      while (exp > 0) {
          if ((exp & 1) == 1) { 
              result = (result * base) % mod;
          }
          base = (base * base) % mod;
          exp >>= 1; 
      }

      return result;
   }
}