class Solution {
    public char[][] solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int j=0;j<m;j++){
            if(visited[0][j]==false && board[0][j]=='O'){
                dfs(0,j,board,visited,n,m);
            }
            if(visited[n-1][j]==false && board[n-1][j]=='O'){
                dfs(n-1,j,board,visited,n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(visited[i][0]==false && board[i][0]=='O'){
                dfs(i,0,board,visited,n,m);
            }
            if(visited[i][m-1]==false && board[i][m-1]=='O'){
                dfs(i,m-1,board,visited,n,m);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        return board;

    }
    private void dfs(int i,int j,char[][] board,boolean[][] visited,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j]==true || board[i][j]=='X'){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,board,visited,n,m);
        dfs(i,j+1,board,visited,n,m);
        dfs(i+1,j,board,visited,n,m);
        dfs(i,j-1,board,visited,n,m);
    }
}