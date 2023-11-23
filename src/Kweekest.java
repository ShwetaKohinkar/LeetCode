import java.util.*;

class Kweekest {
    public static int[] kWeakestRows(int[][] mat, int k) {


        int max = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[mat[0].length];
        for (int i = 0; i< mat.length; i++ ){
            int l = 0;
            int h =  mat[i].length - 1;

            while(l<=h){
                int mid = (l+h)/2;

                if(mat[i][mid] == 0){
                    if(mid == 0 ||  mat[i][mid-1] == 1) {
                        map.put(i, mid);
                        break;
                    }
                    else
                        h = mid-1;
                }
                else {
                    if(mid == mat[i].length-1 || mat[i][mid+1] == 0 ){
                        map.put(i, mid + 1);
                        break;
                    }
                    else
                        l = mid+1;
                }
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a) - map.get(b));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }



    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;

        int[] result = kWeakestRows(mat, k);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
