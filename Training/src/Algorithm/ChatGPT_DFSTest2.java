package Algorithm;

public class ChatGPT_DFSTest2 {
    
    static int[][] maze = {
        {0, 0, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 1, 0, 0},
        {0, 1, 0, 0, 0}
    };
    static int N = maze.length;
    static int M = maze[0].length;
    static boolean[][] visited = new boolean[N][M];
    static int minPathLength = Integer.MAX_VALUE;
    static int count = 0;
    public static void main(String[] args) {
        dfs(0, 0, 0);
        System.out.println("Shortest path length: " + minPathLength);
        System.out.println("count = "+count);
    }

    static void dfs(int x, int y, int pathLength) {
        count ++;
        if (x < 0 || x >= N || y < 0 || y >= M || maze[x][y] == 1 || visited[x][y])
            return;

        if (x == N - 1 && y == M - 1) {
            minPathLength = Math.min(minPathLength, pathLength);
            return;
        }

        visited[x][y] = true;

        dfs(x + 1, y, pathLength + 1); // Down
        dfs(x - 1, y, pathLength + 1); // Up
        dfs(x, y + 1, pathLength + 1); // Right
        dfs(x, y - 1, pathLength + 1); // Left

        visited[x][y] = false;
    }
}





