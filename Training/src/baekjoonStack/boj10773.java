package baekjoonStack;

import java.util.*;
public class boj10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int result = 0;
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            int T = sc.nextInt();
            if(T != 0) {
                st.add(T);
            } else {
                st.pop();
            }
        }
        while(!st.isEmpty()) {
            result += st.pop();
        }
        System.out.println(result);
    }
}
