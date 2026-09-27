// Last updated: 27/09/2026, 21:57:54
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3       boolean[][] rows=new boolean[9][9];
4       boolean[][] cols=new boolean[9][9];
5       boolean[][] boxes=new boolean[9][9];
6       for(int i=0;i<9;i++){
7        for(int j=0;j<9;j++){
8            if(board[i][j]=='.'){
9                continue;
10            }
11            int num=board[i][j]-'1';
12            int box=(i/3)*3+(j/3);
13            if(rows[i][num]||cols[j][num]||boxes[box][num]){
14                return false;
15            }
16            rows[i][num]=true;
17            cols[j][num]=true;
18            boxes[box][num]=true;
19        }
20       }
21       return true;
22    }
23}