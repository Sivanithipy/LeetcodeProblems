class transposematrix {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] tra=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               tra[j][i]=matrix[i][j];
            }
        }
        return tra;
    }
}