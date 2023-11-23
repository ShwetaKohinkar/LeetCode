import java.util.ArrayList;
import java.util.List;

public class townJudge {
        public static int findJudge(int n, int[][] trust) {
            if(trust.length==1){
                return trust[0][1];
            }

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i ++){
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < trust.length; i++){
                int u = trust[i][0];
                int v = trust[i][1];

                adj.get(u-1).add(v-1);
            }
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(adj.get(i).size() == 0)
                    res.add(i+1);
            }
            if(res.size()>1 || res.size() ==0)
                return -1;
            else
                return res.get(0);
        }

    public static void main(String[] args)
    {
        int[][] trustArray = {{1, 2}, {2, 3}};
        int res = findJudge(3,trustArray);

        System.out.println(res);
    }
    }

