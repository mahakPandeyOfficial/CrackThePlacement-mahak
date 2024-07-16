class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [] newRow = new int [row];
        int [] newCol = new int [col];

        Arrays.fill(newRow, -1);
        Arrays.fill(newCol, -1);
    //ye find karne ke liye ki konse index pe zeero hai
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == 0){
                    newRow[i] = 0;
                    newCol[j] = 0;
                } 
            }    
        }
    //update karne ke liye original matrix ko
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col ; j++){
                if(newRow[i] == 0 || newCol[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
