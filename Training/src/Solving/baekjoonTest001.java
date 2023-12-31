package Solving;

import java.util.*;

public class baekjoonTest001 {
    static Queue<Integer> q = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static int node, line, start;
    static boolean[] visited;
    static int arr[][];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        node = sc.nextInt();
        line = sc.nextInt();
        start = sc.nextInt();
        visited = new boolean[node+1];
        
        for(int i =0; i<line; i++) {
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();
            arr[startNode][endNode] = arr[endNode][startNode] = 1;
        }
        
        dfs(start);
    
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start+" ");
        for(int i = 0; i<=line; i++) {
            if(!visited[start] && arr[start][i] == 1) {
                dfs(i);
            }
        } 
    }
}
