package Solving;
import java.util.*;
public class baekjoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int minResult = B;
        int addResult = 0;

        int cnt = 0;
        for(int i = A; i<=B; i++) {
            if(i == 1) continue;
            boolean flag = true;
            for(int j = 2; j<=Math.sqrt(i); j++) {
               if(i%j == 0) {
                
                flag = false;
                break;
               } 
            }
            if(flag) {
                cnt++;
               minResult = Math.min(i,minResult);
               addResult += i;
            }
        }
        if(cnt == 0) {
            System.out.println(-1);
            return;
        }
        
        System.out.println(addResult);
        System.out.println(minResult);
    }
}
