import java.util.ArrayList;

public class GraphsDfsV76 {
    public static void main(String[] args) {
       
    }

    public ArrayList<Integer> dfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(i,adj,vis,ans);
            }

        }
        // dfs(0,adj,vis,ans);

        return ans;
    }

    private void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans) {
        vis[v]=true;

        ans.add(v);
        for(Integer neighbor:adj.get(v)){
            if(!vis[neighbor]){
                dfs(neighbor, adj, vis, ans);
            }
        }
    }
}
