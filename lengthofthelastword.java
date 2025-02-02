class lengthOfLastWord  {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length();

        // Start from the end of the string and skip trailing spaces
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                // If we encounter a space after counting some characters, break
                break;
            }
        }

        return count;
    }
}
