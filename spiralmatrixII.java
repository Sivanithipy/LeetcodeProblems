public class spiralmatrixII {
    public int[][] generateMatrix(int n) {
        int value=1;
		int[][] matrix= new int[n][n];
		int left=0,right=n-1;
		int top=0,bottom=n-1;
		while(value<=n*n)
		{
		    for(int i=left;i<=right;i++)
		    {
		        matrix[top][i]=value++;
		    }
		    top++;
		    for(int i=top;i<=bottom;i++)
		    {
		        matrix[i][right]=value++;
		    }
		    right--;
		    for(int i=right;i>=left;i--)
		    {
		        matrix[bottom][i]=value++;
		    }
		    bottom--;
		    for(int i=bottom;i>=top;i--)
		    {
		        matrix[i][left]=value++;
		    }
		    left++;
		}
		return matrix;
    
    }
}
