import java.util.ArrayList;
import java.util.Stack;

public class GraphTopologicalSortDFSV79{
    public static void main(String[] args) {
        
    }

public static int[] toposort(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(adj,i,stack,vis);
            }
        }

        int ans[]=new int[v];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++]=stack.pop();
        }

        return ans;
        
    }

private static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] vis) {
    vis[v]=true;

    for(int neighbor:adj.get(v)){
        if(!vis[neighbor]){
            dfs(adj, neighbor, stack, vis);
        }
    }
    stack.push(v);
}
}