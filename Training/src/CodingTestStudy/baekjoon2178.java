package CodingTestStudy;
import java.util.*;
public class baekjoon2178 {
    static int result = 200;
    static boolean[][] visited;
    static int count = 200;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        visited = new boolean[height][width];
        int[][] maze = new int[height][width];
        for(int i = 0; i < width; i++) { //넓이
            for(int j = 0; j< height; j++) { // 높이
                maze[i][j] = sc.nextInt();    
            }
        }
        dfs(0,0,0,maze);
        System.out.println(result);
    }
    static void dfs(int curX, int curY, int dist, int[][] arr) {
        visited[curX][curY] = true;
        
        if(curX == arr.length-1 && curY == arr[0].length-1) {
            result = Math.min(dist,result);
            return;
        }
        
        if(curX == -1 || curY == -1 || curX == arr.length || curY == arr[0].length || visited[curX][curY] || arr[curX][curY] == 0) { //안되는 조건
            return;
        }
        
        dfs(curX+1,curY,dist+1,arr);
        dfs(curX,curY+1,dist+1,arr);
        dfs(curX-1,curY,dist+1,arr);
        dfs(curX,curY-1,dist+1,arr);
        visited[curX][curY] = false;
        
    }
}
