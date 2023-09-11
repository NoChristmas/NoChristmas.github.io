package CodingTestStudy;
import java.util.*;
public class TestNote {
    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        int N = 5;

        for(int i = 1; i<=5; i++) {
            graph.add(new ArrayList<>()); //List 안에 List 방 만들기
        }
        
        graph.get(1).add(new Edge(2,5)); //int[1]번 방에 int[1] = {2,5};식으로 넣겠다는 뜻임
        graph.get(2).add(new Edge(1,5)); //int[2]번 방에 int[2] = {1,5};식으로 넣겠다는 뜻임
        
        graph.get(1).add(new Edge(3,7));
        graph.get(3).add(new Edge(1,7));
        System.out.println(graph.toString());
        System.out.println(graph.get(1));
        System.out.println(graph.get(2));
    }

    static class Edge {
        int a;
        int b;
        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
    }
}
