class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        return dfs(visited,adj,source,destination);
    }
    private boolean dfs(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int source, int destination){
        if(source == destination) return true;
        if(visited[source]) return false;
        visited[source] = true;
        for(int nei: adj.get(source)){
            if(dfs(visited,adj,nei,destination)) return true;
        }
        return false;
    }
}