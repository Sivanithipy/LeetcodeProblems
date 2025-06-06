class validparantheses {
  public boolean isValid(String s) {
      Stack<Character> st = new Stack<Character>();
      
      for (int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          
          if (ch == '{' || ch == '[' || ch == '(') {
              st.push(ch);
          } else {
              if (st.isEmpty()) return false;

              if (ch == '}') {
                  if (st.peek() == '{') st.pop();
                  else return false;
              } else if (ch == ']') {
                  if (st.peek() == '[') st.pop();
                  else return false;
              } else if (ch == ')') {
                  if (st.peek() == '(') st.pop();
                  else return false;
              }
          }
      }

      return st.isEmpty();
  }
}
