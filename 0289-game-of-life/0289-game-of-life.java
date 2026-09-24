class Solution {

    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] clone =new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                clone[i][j]=board[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(clone[i][j]==1){
                    int live=findLive(i,j,clone);
                    if(live==2 || live==3){
                        board[i][j]=1;
                    }else{
                        board[i][j]=0;
                    }
                }else{
                    int live=findLive(i,j,clone);
                    if(live==3){
                        board[i][j]=1;
                    }else{
                        board[i][j]=0;
                    }
                }
            }
        }
    }
    private int findLive(int i, int j, int[][] grid) {
        int live = 0;
        int n = grid.length;
        int m = grid[0].length;

        // Top-Left
        if (i - 1 >= 0 && j - 1 >= 0 && grid[i - 1][j - 1] == 1) live++;
        
        // Top
        if (i - 1 >= 0 && grid[i - 1][j] == 1) live++;
        
        // Top-Right
        if (i - 1 >= 0 && j + 1 < m && grid[i - 1][j + 1] == 1) live++;
        
        // Left
        if (j - 1 >= 0 && grid[i][j - 1] == 1) live++;
        
        // Right
        if (j + 1 < m && grid[i][j + 1] == 1) live++;
        
        // Bottom-Left
        if (i + 1 < n && j - 1 >= 0 && grid[i + 1][j - 1] == 1) live++;
        
        // Bottom
        if (i + 1 < n && grid[i + 1][j] == 1) live++;
        
        // Bottom-Right
        if (i + 1 < n && j + 1 < m && grid[i + 1][j + 1] == 1) live++;

        return live;
    }
}