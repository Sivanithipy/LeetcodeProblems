class Solution {
  public int hIndex(int[] citations) {
      int[] count=new int[citations.length+1];
      for(int citationCountOfPaper:citations)
      {
          if(citationCountOfPaper>=citations.length)
          {
              count[citations.length]+=1;

          }
          else
          {
              count[citationCountOfPaper]+=1;
          }
      }
      int paperWithAtleastHCitations=0;
      for(int h=citations.length;h>=0;h--)
      {
           paperWithAtleastHCitations+=count[h];
           if( paperWithAtleastHCitations>=h)
           {
              return h;
           }
      }
      return 0;
  }
}