package CodingTestStudy;
import java.util.*;
public class baekjoon1874 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        List<String> list = new ArrayList<>();
        int[] result = new int[N];
        int idx = 0;
        
        for(int i = 1; i<=N; i++) {
            st.push(i); //push는 무조건 일어남...
            list.add("+");
            while(!st.isEmpty()) {
                if(arr[idx] == st.peek()) {
                    result[idx] = st.pop();
                    list.add("-");
                    idx++;
                } else {
                    break;
                }
            }
        }
        
        if (idx != N) {
            System.out.println("NO");
        } else {
            for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
            }
        }
        
        
        //4 3 6 8 7 5 2 1
        //+ 1
        //+ 1,2
        //+ 1,2,3
        //+ 1,2,3,4
        //- 1,2,3
        //- 1,2
        //+ 1,2,5
        //+ 1,2,5,6
        //- 1,2,5
        //+ 1,2,5,7,8 
        //
    }
}
