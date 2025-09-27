import java.util.*;

class Solution {
    Map<Integer, Integer> mpp = new HashMap<>();

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (List<Integer> e : edges) {
            adj.get(e.get(0)).add(e.get(1));
        }

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            dfs(adj, visited, i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(mpp); 
        for(Map.Entry<Integer,Integer> ent: mpp.entrySet()){
            if(ent.getValue() == 1) arr.add(ent.getKey());
        }
        return arr;
    }

    private void dfs(List<List<Integer>> edges, boolean[] visited, int node){
        mpp.put(node, mpp.getOrDefault(node, 0) + 1); // increment every time DFS reaches node
        if(visited[node]) return;
        visited[node] = true;
        for(int nei: edges.get(node)){
            dfs(edges, visited, nei);
        }
    }

}
