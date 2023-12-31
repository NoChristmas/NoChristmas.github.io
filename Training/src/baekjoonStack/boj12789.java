package baekjoonStack;
import java.util.*;
public class boj12789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<N; i++) {
            queue.add(sc.nextInt());    
        }
        int currentNeedNumber = 1;
        while(true) {
            if(!queue.isEmpty() && queue.peek() == currentNeedNumber) { 
                list.add(queue.poll());
                currentNeedNumber++;
            } else if(!st.isEmpty() && st.peek() == currentNeedNumber) { 
                list.add(st.pop());
                currentNeedNumber++;
            } else if(queue.isEmpty()) {  
                if(st.peek() != currentNeedNumber) {
                    System.out.println("Sad");
                    break;
                }
            } else {
                st.add(queue.poll());
            }
            
            if(list.size() ==  N) { //종료 조건
                System.out.println("Nice");
                break;
            }
        }
        
    }
}
