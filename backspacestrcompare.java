class backspacestrcompare {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
        
    }
    private String buildString(String str)
    {
        StringBuilder r=new StringBuilder();
        for(char ch:str.toCharArray())
        {
            if(ch=='#')
            {
                if(r.length()>0)
                {
                    r.deleteCharAt(r.length()-1);

                }
            }    
                else
                {
                    r.append(ch);
                }
        }
        return r.toString();
    }
}