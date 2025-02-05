class wordpattern {
  public boolean wordPattern(String pattern, String s) {
      String[] words = s.split(" ");
      if (pattern.length() != words.length) {
          return false;
      }
      HashMap<Character, String> patternToWord = new HashMap<>();
      HashMap<String, Character> wordToPattern = new HashMap<>();
      for (int i = 0; i < pattern.length(); i++) {
          char p = pattern.charAt(i);
          String word = words[i];
          if (patternToWord.containsKey(p)) {
              if (!patternToWord.get(p).equals(word)) {
                  return false; 
              }
          } else {
              patternToWord.put(p, word); 
          }
           if (wordToPattern.containsKey(word)) {
              if (wordToPattern.get(word) != p) {
                  return false; 
              }
          } else {
              wordToPattern.put(word, p); 
          }
      }
      return true; 
  }
}