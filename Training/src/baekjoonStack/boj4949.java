package baekjoonStack;
import java.util.*;
public class boj4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        while(true) {
            s = sc.nextLine();
            if (s.equals(".")) {
                break;
            } else {
                System.out.println(solve(s));
            }
        }
    }

    public static String solve(String s) {
        Stack<String> st = new Stack<>();
        for(String str : s.split("")){
            if(str.equals("[") || str.equals("(")) {
                st.add(str);
            } else if(str.equals("]")) {
                if(st.isEmpty() || !st.peek().equals("[")) {
                    return "no";
                } else {
                    st.pop();
                }
            } else if(str.equals(")")) {
                if(st.isEmpty() || !st.peek().equals("(")) {
                    return "no";
                } else {
                    st.pop();
                }
            }
        }

        if (st.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
