class pascalstriII {
  public List<Integer> getRow(int rowIndex) {
      List<List<Integer>>pascal=new ArrayList();
      for(int i=0;i<=rowIndex;i++)
      {
          List<Integer>row=new ArrayList();
          for(int j=0;j<=i;j++)
          {
              if(j==0||j==i)
              {
                  row.add(1);
              }
              else
              {
                  List<Integer>pre=pascal.get(i-1);
                  row.add(pre.get(j)+pre.get(j-1));
              }
          }
          pascal.add(row);
      }
      return pascal.get(rowIndex);
  }
}
