
class intersectionofarray {
  public int[] intersection(int[] A, int[] B) {
      HashSet<Integer> set = new HashSet<>();
      ArrayList<Integer> ans = new ArrayList<>();
      for (int num : A) {
          set.add(num);
      }
      for (int num : B) {
          if (set.contains(num)) {
              ans.add(num);
              set.remove(num);
          }
      }
       int[] result = new int[ans.size()];
      for (int i = 0; i < ans.size(); i++) {
          result[i] = ans.get(i);
      }
      
      return result;
  }
} 