class Solution {
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
        if (V <= 1) {
            return new ArrayList<>(Collections.singletonList(0));
        }

        // 1. Build Adjacency List and Degree Array
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new HashSet<>());
        int[] degree = new int[V];
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
            degree[edge[0]]++;
            degree[edge[1]]++;
        }

        // 2. Initialize Queue with all current leaves
        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (degree[i] == 1) {
                leaves.offer(i);
            }
        }

        // 3. Trim leaves until 1 or 2 nodes remain
        int remainingNodes = V;
        while (remainingNodes > 2) {
            int leafCount = leaves.size();
            remainingNodes -= leafCount;
            
            for (int i = 0; i < leafCount; i++) {
                int leaf = leaves.poll();
                
                // Get the neighbor of this leaf
                for (int neighbor : adj.get(leaf)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        leaves.offer(neighbor);
                    }
                }
            }
        }

        // The remaining nodes in the queue are the MHT roots
        return new ArrayList<>(leaves);
    }
}
    