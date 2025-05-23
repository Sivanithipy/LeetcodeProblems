class findthehigalt {
    public int largestAltitude(int[] gain) {
       int al=0;
       int maxal=0;
       for(int g:gain) 
       {
        al+=g;
        
       if(al>maxal)
       {
        maxal=al;
       }
       }
       return maxal;     
    }
}