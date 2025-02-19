class GasStation {
  public int canCompleteCircuit(int[] gas, int[] cost) {
      int t_l=0;
      for(int i=0;i<gas.length;i++)
      {
          t_l+=gas[i]-cost[i];
      }
      if(t_l<0)
      {
          return -1;
      }
      int startIndex=0;
      int rem=0;
      for(int i=0;i<gas.length;i++)
      {
          int currentgas=gas[i]+rem;
          int currentCost=cost[i];
          rem=currentgas-currentCost;
          if(rem<0)
          {
              rem=0;
              startIndex=i+1;
          }
      }
      return startIndex;
  }
}