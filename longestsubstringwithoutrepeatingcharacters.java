class longestsubstringwithoutrepeatingcharacter {
  public int lengthOfLongestSubstring(String s) {
      HashSet<Character>set=new HashSet<>();
      int count=0;
      int maxLength=0;
      for(int i=0;i<s.length();i++)
      {
          while(set.contains(s.charAt(i)))
          {
              set.remove(s.charAt(count));
              count++;
          }
          set.add(s.charAt(i));
          maxLength=Math.max(maxLength,i-count+1);
      }
      return maxLength;
  }
}
