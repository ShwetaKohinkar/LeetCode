import java.util.ArrayList;
import java.util.List;


public class findString
{
        public static boolean exist(char[][] board, String word) {
            int row = board.length;
            int col = board[0].length;
            int ptr = 0;
            boolean[][] visited = new boolean[row][col];
            if(word=="") return false;
            if(row==1 && col == 1){
                if(board[row -1][col-1] == word.charAt(0) ){
                    return true;
                }
            }


            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    if(board[i][j]==(word.charAt(ptr))){
                        ptr++;
                        if(rec(board, visited, word, ptr, i, j)){
                            return true;
                        }
                    }

                }
            }
            return false;
        }

        public static List<List<Integer>> findAdj(char[][] board, int row, int col){
            List<List<Integer>> adj = new ArrayList<>();
            List<Integer> list= new ArrayList<>();
            if(col-1 >= 0 && col-1< board[row].length){
                list.add(row);
                list.add(col-1);
                adj.add(list);
            }
            if(row-1 >=0 && row -1< board.length){
                list= new ArrayList<>();
                list.add(row-1);
                list.add(col);
                adj.add(list);
            }
            if(col+1 >= 0  && col+1 < board[row].length )
            {
                list= new ArrayList<>();
                list.add(row);
                list.add(col+1);
                adj.add(list);
            }
            if(row+1 < board.length){
                list= new ArrayList<>();
                list.add(row+1);
                list.add(col);
                adj.add(list);
            }
            return adj;
        }

        public static boolean rec(char[][] board, boolean[][] visited, String word, int ptr, int row, int col){

            visited[row][col] = true;
            List<List<Integer>> adj = findAdj(board, row, col);

            for(List<Integer> v : adj){
                if(!visited[v.get(0)][v.get(1)] && board[v.get(0)][v.get(1)] == word.charAt(ptr) ){
                    ptr++;
                    if(word.length()!=ptr){
                        if(rec(board, visited, word, ptr, v.get(0), v.get(1))){
                            return true;
                        }
                    }
                    else{
                        return true;
                    }
                }
            }
            return false;
        }


    public static void main(String[] args)
    {
        char[][] trustArray = {{'A'}};
        boolean res = exist(trustArray,"A");

        System.out.println(res);
    }
    }

