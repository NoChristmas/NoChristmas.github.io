package Solving;
import java.util.*;
public class baekjoon1260 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] arr;
    static int node, line, start;
    static Scanner sc;
    
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        node = sc.nextInt();
        line = sc.nextInt();
        start = sc.nextInt();
        
        arr = new int[node+1][node+1];
        

        for(int i =0; i<line; i++) {
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();
            arr[startNode][endNode] = arr[endNode][startNode] = 1;
        }
            visited = new boolean[node+1];
            dfs(start);
            sb.append("\n");
            visited = new boolean[node+1];
            bfs(start);

            System.out.println(sb);
    }
    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");
        for(int i =0; i<=node; i++) {
            if(arr[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
    public static void bfs(int start) {
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start+" ");
            for(int i = 1; i<=node; i++) {
                if(arr[start][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }   
            }
        }
    }
}
