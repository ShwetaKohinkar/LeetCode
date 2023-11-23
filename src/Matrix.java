public class Matrix {
    public static boolean matrixMoves(char[][] grid, int k){

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length;j++){
                if(checkHorizontal(grid, k, i, j)){
                    return true;
                }
            }
        }
//
//        for(int col = 0; col<grid[0].length; col++){
//            for(int row = 0; row<grid.length; row++){
//                if(checkVertical(grid, k, col, row)){
//                    return true;
//                }
//            }
//        }

//        for(int i = 0; i<grid.length; i++){
//            for(int j = 0; j<grid[i].length;j++){
//                if(checkRightDiag(grid, k, i, j)){
//                    return true;
//                }
//            }
//        }


        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length;j++){
                if(checkLeftDiag(grid, k, i, j)){
                    return true;
                }
            }
        }

        return false;
    }


    public static boolean checkLeftDiag(char[][] grid, int k, int row, int col){
        if(col+1 >=k && grid.length -1 - row >=k )
        {
            for(int l = 0; l<k; l++){
                if(grid[row][col] !='X'){
                    return false;
                }
                row++;
                col--;
            }
            System.out.println("checkLeftDiag:" + row + col);

            return true;
        }
        return false;

    }

    public static boolean checkRightDiag(char[][] grid, int k, int row, int col){
        if(grid[row].length -1 - col>=k && grid.length -1 - row >=k )
        {
            for(int l = 0; l<k; l++){
                if(grid[row][col] !='X'){
                    return false;
                }
                row++;
                col++;
            }
            System.out.println("checkRightDiag:" + row + col);

            return true;
        }
        return false;

    }
    public static boolean checkVertical(char[][] grid, int k, int row, int col){
        if(grid.length -1 - row >=k)
        {
            for(int l = row; l<k+row; l++){
                if(grid[l][col] !='X'){
                    return false;
                }
            }
            System.out.println("checkVertical:"+row+col);
            return true;
        }
        return false;
    }

    public static boolean checkHorizontal(char[][] grid, int k, int row, int col){
        if(grid[row].length -1 <= col + k)
        {
            for(int l = col; l<k+col; l++){
                if(grid[row][l] !='X'){
                    return false;
                }
            }
            System.out.println("checkHorizontal:" + row + col);

            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        char[][] board = {
                {'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X', 'O', 'O', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'O', 'X', 'O', 'X', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'X'},
                {'O', 'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'X'},
                {'O', 'X', 'O', 'X', 'O', 'O', 'X', 'X', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'X', 'X', 'O', 'X', 'O', 'O'},
                {'X', 'X', 'X', 'O', 'X', 'X', 'X', 'X', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'O', 'X', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X', 'O', 'X', 'X', 'O', 'X'}
        };

        System.out.println(matrixMoves(board, 4));
    }
}
