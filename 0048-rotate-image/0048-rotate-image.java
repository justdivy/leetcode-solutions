class Solution {
    public void rotate(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i<rows; i++){
            for(int j = i+1; j<cols; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<rows; i++){

            int stCols=0; 
            int endCols = cols - 1;

            while(stCols < endCols){
                int temp = arr[i][stCols];
                arr[i][stCols] = arr[i][endCols];
                arr[i][endCols] = temp;

                stCols++;
                endCols--;
            }
        }
    }
}