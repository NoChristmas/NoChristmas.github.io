package CodingTestStudy;
import java.util.*;


public class baekjoon18126 {
    static int N; //너구리 구구에게 주어진 방 경로 갯수
    static List<List<Edge>> graph; //방별 현재 방, 다음 방의 관계 graph
    static boolean[] visited; //방별 방문 유무 체크 boolean
    static long maxDistance = 0; //그 중에 가장 큰 값의 거리를 가져올 정답
    static int farthestNode = 1; //가까운 노드

    static class Edge {
        int to; //다음 방
        int c; //그 방을 갈 때 거리

        public Edge(int to, int c) {
            this.to = to;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new ArrayList<List<Edge>>();
        
        for(int i = 1; i <= N; i++) {
            graph.add(new ArrayList<>()); //List<Edge>를 담을 방 만들기 
        }
        
        for(int i = 1; i <= N-1; i++) { //N-1 만큼 싸이클을 돌며 입력을 받음
            int A = sc.nextInt(); //출발 방
            int B = sc.nextInt(); //도착 방
            int C = sc.nextInt(); //거기에 소비된 거리
            graph.get(A).add(new Edge(B,C)); 
            graph.get(B).add(new Edge(A,C));
        }
        
        visited = new boolean[N+1];
        visited[1] = true;
        dfs(1,0);
                
        System.out.println(maxDistance);
    }

    static void dfs(int cur, long distance) {
        if (maxDistance < distance) { //거리를 쌓는 조건은 tree 구조로 봤을 때 노드를 돌며 그냥 최대 거리가 쌓이면 가져감
            
            maxDistance = distance;
        }

        for (Edge next : graph.get(cur)) {
            System.out.println("next = " + next);
            if (!visited[next.to]) { //안들렀던 방이면
                visited[next.to] = true; //true 를 만들고
                dfs(next.to, distance+next.c); //다음 방을 타고 다시 재귀, 거리도 그에 따라 추가
            } 
             //안들렀던 방이면 true 만들고
             //재귀로 다시 호출 (다음 방, 거리를 추가)
        }
    }
}