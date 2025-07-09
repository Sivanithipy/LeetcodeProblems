import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIndAllDuplicateInAnArray {
     public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> a=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        for(int num:nums){
         a.put(num,a.getOrDefault(num,0)+1);
         
        }
        for(int num:a.keySet())
        {
            if(a.get(num)>1)
            {
                result.add(num);
            }
        }
        return result;
    }
}
