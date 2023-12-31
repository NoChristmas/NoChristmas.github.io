package CodingTestStudy;
import java.util.*;
public class baekjoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st;
        int N = sc.nextInt();
        boolean flag = true;
        for(int i = 0; i<N; i++) {
            String VPS = sc.next();
            st = new Stack<>();
            flag = true;
            if(VPS.charAt(0) == ')') {
                System.out.println("NO");
                continue;
            }

            for(String str : VPS.split("")) {
                if(str.equals(")")) {
                    if(st.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        st.pop();
                    }
                } else {
                    st.push(str);    
                }
            }

            if(st.isEmpty() && flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
