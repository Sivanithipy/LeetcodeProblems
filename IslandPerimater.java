public class IslandPerimater {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        if (grid.length == 0) return 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    if (i > 0 && grid[i - 1][j] == 1)
                        sum -= 2;

         
                    if (j > 0 && grid[i][j - 1] == 1)
                        sum -= 2;
                }
            }
        }

        return sum;
    }
}
