class validpalindrome {
  public boolean isPalindrome(String s) {
      StringBuilder filteredString = new StringBuilder();
      
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if (Character.isLetterOrDigit(c)) {
              filteredString.append(Character.toLowerCase(c));
          }
      }
      
      int n = filteredString.length();
      for (int i = 0; i < n / 2; i++) {
          if (filteredString.charAt(i) != filteredString.charAt(n - 1 - i)) {
              return false;
          }
      }
      
      return true;
  }
}

