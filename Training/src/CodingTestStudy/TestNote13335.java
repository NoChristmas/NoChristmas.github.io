package CodingTestStudy;
import java.util.*;
public class TestNote13335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //트럭개수
        int w = sc.nextInt(); //다리길이
        int L = sc.nextInt(); //다리최대무게
        
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < n; i++) trucks.add(sc.nextInt());
        for(int i = 0; i < w; i++) bridge.add(0);
        
        
        int clock = 0;
        int totalWeight = 0;
        while(!bridge.isEmpty()) {
            clock++;
            totalWeight -= bridge.poll();
            if(!trucks.isEmpty()) {
                if(trucks.peek() + totalWeight <= L) {
                    totalWeight += trucks.peek();
                    bridge.add(trucks.poll());
                } else {
                    bridge.add(0);
                }
            }
        }
        System.out.println(clock);
    }
}
