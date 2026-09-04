class Solution {
    public int numIslands(char[][] grid) {
        int islands=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=true && grid[i][j]=='1'){
                dfs(i,j,grid,visited,n,m);
                islands++;
            }
        }
        }
        return islands;

    }
    private void dfs(int i,int j,char[][] grid,boolean[][] visited,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j]==true || grid[i][j]=='0'){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,grid,visited,n,m);
        dfs(i,j+1,grid,visited,n,m);
        dfs(i+1,j,grid,visited,n,m);
        dfs(i,j-1,grid,visited,n,m);
    }
}