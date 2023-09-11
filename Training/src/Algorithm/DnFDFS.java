package Algorithm;

public class DnFDFS {
    /*
    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int k = 80;

        
        Solution(k, dungeons);

    } */
    static boolean[] visited;
    static int count = 0;
        
    public int Solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0,k,dungeons);
        return count;
    }

    public void dfs(int depth, int fatigue, int[][] dungeons) { // fatigue는 피로도...
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }
            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        count = Math.max(count,depth);
    }
    
}
