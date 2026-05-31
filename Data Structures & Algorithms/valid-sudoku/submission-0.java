class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i ++){
            boolean[] rows = new boolean[10];
            boolean[] column = new boolean[10];
            for(int j = 0 ; j < 9 ;j++){
                char rowCell = board[i][j];
                     if(rowCell != '.'){
                     int cellDigit = rowCell - '0';
                    if(rows[cellDigit]){
                        return false;
                    }else{
                        rows[cellDigit] = true;
                    }
                }

             char colCell = board[j][i];
             
             if(colCell != '.'){
                int cellDigit = colCell - '0';
                if(column[cellDigit]){
                    return false;
                }else{
                    column[cellDigit] = true;
                }
             }
        }
            }

            for(int ri = 0 ; ri<9;ri+=3){
               for(int cj = 0 ; cj<9;cj+=3){
                  boolean[] cellSeen = new boolean[10];
                  for(int i = ri; i < ri+3;i++){
                    for(int j = cj; j < cj+3;j++){
                        char cell = board[i][j];
                        if(cell!= '.'){
                            int cellDigit = cell - '0';
                            if(cellSeen[cellDigit]){
                                return false;
                            }else{
                                cellSeen[cellDigit] = true;
                            }
                        }
                    }
                  }
            }  
            }
                return true;
    }
}
