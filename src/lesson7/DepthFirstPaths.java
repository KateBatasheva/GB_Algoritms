package lesson7;

public class DepthFirstPaths extends FirstPaths{

    public DepthFirstPaths(Graph g, int source) {
        super(g);
        super.source = source;
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }
}
