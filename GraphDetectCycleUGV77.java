import java.util.ArrayList;

public class GraphDetectCycleUGV77 {
    public static void main(String[] args) {
        
    }

    public boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++){   //may the graph is not connected ......to tranverse the comlete graph we have run the fro loop
            if(!vis[i]){
                if(dfs(i,adj,vis,-1)){
                    return true;
                }
            }
        } 
        return false;
    }

    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
        vis[v]=true;
        
        for(Integer neighbor:adj.get(v)){
            if(!vis[neighbor]){
                if(dfs(neighbor, adj, vis, v)){
                    return true;
                }
            }
        
        else if(parent!=neighbor){
            return true;
        }
    }
        return false;
    }
}
