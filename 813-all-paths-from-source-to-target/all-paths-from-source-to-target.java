class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        boolean[] visited=new boolean[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int nei : graph[i]) adj.get(i).add(nei);
        }
        int source = 0;
        int destination = n-1;
        dfs(adj, visited, source, destination, new ArrayList<>());
        return res;
    }
    private void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node, int destination, ArrayList<Integer> ans){
        if (visited[node]) return;       
        visited[node] = true;           
        ans.add(node);

        if (node == destination) {
            res.add(new ArrayList<>(ans));
        } else {
            for (int nei : adj.get(node)) {
                dfs(adj, visited, nei, destination, ans);
            }
        }

        ans.remove(ans.size() - 1);  
        visited[node] = false;     
    }
}