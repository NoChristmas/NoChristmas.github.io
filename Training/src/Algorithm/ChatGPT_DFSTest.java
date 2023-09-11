package Algorithm;

public class ChatGPT_DFSTest {
    static int[][] graph = {{1,2},{0,3,4},{0,5},{1},{1},{2}};
    static boolean[] visited = new boolean[graph.length];
    public static void main(String[] args) {
        
        dfs(0);
    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " -> ");
        for(int neighbor : graph[nodeIndex]) {
            if(!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
