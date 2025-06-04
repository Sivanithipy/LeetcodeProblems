class checkbalastr {
    public boolean isBalanced(String num) {
        int count=0,sum=0;
        for(int i=0;i<num.length();i++)
        {
            int d=num.charAt(i)-'0';
            if(i%2==0)
            {
                count=count+d;
            }
            else
            {
                sum=sum+d;
            }
            
        }
        return count==sum;
    }
}