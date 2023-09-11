package CodingTestStudy;
import java.util.*;
public class TestNote01 {
    static class Edge {
        int to;
        int dist;
        public Edge(int to, int dist) {
            this.to = to;
            this.dist = dist;        
        }
    }
    static int N;
    static boolean[] visited;
    static List<List<Edge>> graph;
    static long answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new ArrayList<>();
        for(int i = 1; i<=N+1; i++) { //방만들기
            graph.add(new ArrayList<>());
        }
        
        for(int i = 1; i<=N-1; i++) {
            int currentRoom = sc.nextInt();
            int endRoom = sc.nextInt();
            int distance = sc.nextInt();
            graph.get(currentRoom).add(new Edge(endRoom,distance));
            graph.get(endRoom).add(new Edge(currentRoom,distance));
        }
        //start node, distance
        visited = new boolean[N];
        visited[1] = true;
        dfs(1,0);
        System.out.println(answer);
    }

    static void dfs(int currentNode, long dist) {
        if(answer < dist) {
            answer = dist;
        } 
        for(Edge next : graph.get(currentNode)) {
            if(!visited[next.to]) {
                visited[next.to] = true;
                dfs(next.to, dist+next.dist);
            }
        }
    }
}