package CodingTestStudy;
import java.util.*;
public class baekjoon13335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //트럭 갯수
        int w = sc.nextInt(); //다리의 길이
        int L = sc.nextInt(); //다리의 최대 하중
        
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        int clock = 0;
        int bridgeWeight = 0;

        //트럭개수 4개 입력
        for(int i = 0; i <n; i++) truck.add(sc.nextInt());
        //다리의 Queue
        for(int i = 0; i <w; i++) bridge.add(0);
        
        while(!bridge.isEmpty()) {
            clock++; //1초가 흐름
            bridgeWeight -= bridge.poll(); // 다리무게에서 내려온 트럭 무게를 뺌
            
            if(!truck.isEmpty()){ //트럭 보내기
                if(truck.peek() + bridgeWeight <= L) { // 앞의 트럭이 더해져도 다리의 최대하중보다 작다면
                    bridgeWeight += truck.peek(); //진짜 보내기
                    bridge.add(truck.poll()); // 다리에 트럭 추가
                }else{ // 최대 하중을 초과하면
                    bridge.add(0); // 다리위에 아무것도 안실림
                }
            }
        }

        System.out.println(clock);
    }
}
