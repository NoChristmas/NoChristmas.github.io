package CodingTestStudy;
import java.util.*;
public class baekjoon1461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //책 개수
        int M = sc.nextInt(); //책 들 수 있는 개수
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();

        int max = 0;
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(max < Math.abs(num)) max = Math.abs(num);
            if(num > 0) plus.add(num);
            else minus.add(Math.abs(num));
        }
        
        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus, Collections.reverseOrder());
        
        for (int i = 0; i < plus.size(); i++) {
            // 가장 멀리 있는 곳일 경우  
            if (i % M == 0 && plus.get(i) == max) {
                answer += plus.get(i);
            } 
            // 최대한 책을 많이 가지고 꽂는 위치
            else if (i % M == 0) {
                answer += (plus.get(i) * 2);
            }
        }
        
        for (int i = 0; i < minus.size(); i++) {
            if (i % M == 0 && minus.get(i) == max) {
                answer += minus.get(i);
            } else if (i % M == 0) {
                answer += (minus.get(i) * 2);
            }
        }
        
        System.out.println(answer);
    }
}
