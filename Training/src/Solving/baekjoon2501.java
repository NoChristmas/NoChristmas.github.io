package Solving;
import java.util.*;
public class baekjoon2501 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //약수가 될 수
        int N = sc.nextInt();
        //인덱스 M-1로 가져올 수
        int M = sc.nextInt();

        for(int i = 1; i<=N; i++) {
            if(N % i == 0) {
                list.add(i);
            }
        }
        
        if(M-1 >= list.size()) {
            System.out.println(0);
        } else {
            System.out.println(list.get(M-1));
        }
        
    }
}
