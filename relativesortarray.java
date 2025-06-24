import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class relativesortarray {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
            freqMap.remove(num);
        }
        List<Integer> remaining = new ArrayList<>(freqMap.keySet());
        Collections.sort(remaining);
        for (int num : remaining) {
            int count = freqMap.get(num);
            for (int i = 0; i < count; i++) {
                result.add(num);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
