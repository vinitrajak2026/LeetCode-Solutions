class Solution {
    public boolean checkValidGrid(int[][] grid) {
     int n=grid.length;
     if(grid[0][0]!=0){
        return false;

     } 
     int [][]  pos=new int[n*n][2];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int move=grid[i][j];
            pos[move][0]=i;
            pos[move][1]=j;
        }
     }  
     for(int i=0;i<n*n-1;i++){
        int r1=pos[i][0];
        int c1=pos[i][1];
        int r2=pos[i+1][0];
        int c2=pos[i+1][1];

        int rowdiff=Math.abs(r1-r2);
        int coldiff=Math.abs(c1-c2);

        if (!((rowdiff == 2 && coldiff == 1) ||
      (rowdiff == 1 && coldiff == 2))) {
    return false;
}
     }
     return true;
    }
}