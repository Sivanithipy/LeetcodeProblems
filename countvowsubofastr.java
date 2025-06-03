class countvowsubofstr {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (isVowel(c)) {
                    vowels.add(c);
                    if (vowels.size() == 5) {
                        count++;
                    }
                } else {
                    break; 
                }
            }
        }

        return count;
    }
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
