class perofletinstr {
    public int percentageLetter(String s, char letter) {
        int sum=1,count=0;
        int n=s.length();
        for(char c:s.toCharArray())
        {
            if(c==letter)
            {
             count=count+1;
            }
        }
        int per=(int)((count*100.0)/n);
        return per;
    }
}

