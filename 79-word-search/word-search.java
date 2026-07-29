
class Solution {
    public boolean isFound(char[][] board, String word,int idx,int i ,int j){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || j<0 ||i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean isFound =  isFound(board,word,idx+1,i-1,j)||isFound(board,word,idx+1,i+1,j)||
                            isFound(board,word,idx+1,i,j-1)||isFound(board,word,idx+1,i,j+1);
        board[i][j] = temp; 
         return isFound;
    }
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                if(isFound(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
}