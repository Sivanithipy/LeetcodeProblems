import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>map=new HashMap<>();
        String[] words=(s1+" "+s2).split(" ");
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String> result=new ArrayList<>();
        for(String word:map.keySet())
        {
            if(map.get(word)==1)
            {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
