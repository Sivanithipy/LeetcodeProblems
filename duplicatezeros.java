class  duplicatezeros  {
  public void duplicateZeros(int[] arr) {
      int n = arr.length;
      int z = 0;
      for (int i = 0; i < n; i++) {
          if (arr[i] == 0) {
              z++;
          }
      }

      int i = n - 1;
      int j = n + z - 1;
      while (i >= 0 && j >= 0) {
          if (j < n) {
              arr[j] = arr[i];
          }

          if (arr[i] == 0) {
              j--;
              if (j < n) {
                  arr[j] = 0;
              }
          }

          i--;
          j--;
      }
  }
}

