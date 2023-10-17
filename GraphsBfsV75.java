import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.print.FlavorException;

public class GraphsBfsV75 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=6;
        int e=8;

        boolean[] vis = new boolean[v+1];
        int pred[] = new int[v+1];
        int dist[]=new int[v+1];

        int components = 0;
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                components++;
                bfs(adj, 1, 6, v, pred, dist);
            }
        }
        boolean isReached =bfs(adj, 1, 6, v, pred, dist);


    }

    private static boolean bfs(ArrayList<ArrayList<Integer>> adj,int src,int dest,int v,int pred[],int dist[]){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++){ 
            visited[i]=false; 
            dist[i]=Integer.MAX_VALUE;
            pred[i]=-1;
        }

        visited[src]=true;
        dist[src]=0;
        queue.add(src);

        while(!queue.isEmpty()){

            int cur =queue.remove();
            for(int i=0;i<adj.get(cur).size();i++){
                int neighbor = adj.get(cur).get(i);
                
                if(visited[neighbor]==false){
                    visited[neighbor]=true;
                    dist[neighbor]=dist[cur]+1;
                    pred[neighbor]=cur;
                    queue.add(neighbor);

                    if(neighbor==dest){
                        return true;
                    }
                }
            }

        }
        return false; 

    }
}
