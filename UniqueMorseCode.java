import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String>transform=new HashSet<>();
        for(String word:words)
        {
            StringBuilder morseWord=new StringBuilder();
            for(char c:word.toCharArray())
            {
                morseWord.append(morse[c-'a']);
            }
            transform.add(morseWord.toString());
        }
        return transform.size();
    }
}
