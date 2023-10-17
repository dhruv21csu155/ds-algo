import java.util.ArrayList;

public class GraphDetctCycleDGV78 {

    public static void main(String[] args) {
        
    }

    // Time Complexity =O(E+V)
    public boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v];
        boolean recs[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,recs)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] recs) {
        vis[v]=true;
        recs[v]=true;

        for(Integer neighbor:adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(neighbor, adj, vis, recs)){
                    return true;
                }
            }
            else if(recs[neighbor]){
                return true;
            }
        }
        recs[v]=false;
        return false;
    }
}
