class removeoutermostparentheses  {
  public String removeOuterParentheses(String s) {
      StringBuilder a=new StringBuilder();
      int depth=0;
      for(char c:s.toCharArray())
      {
          if(c=='(')
          {
              if(depth>0) a.append(c);
              depth++;
          }
          else if(c==')')
          {
              depth--;
              if(depth>0) a.append(c);
          }
          
      }
      return a.toString();
  }
}
