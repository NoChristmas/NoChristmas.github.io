package baekjoonStack;
import java.util.*;
public class boj28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            int input = sc.nextInt();
            if(input == 1) {
                st.add(sc.nextInt());
            } else if(input == 2) {
                if(!st.isEmpty()) {
                    sb.append(st.pop()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if(input == 3) {
                sb.append(st.size()).append("\n");
            } else if(input == 4) {
                if(st.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else {
                if(!st.isEmpty()) {
                    sb.append(st.peek()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }

            }
        }
        System.out.println(sb);        
    }
}
