package CodingTestStudy;
import java.util.*;
public class baekjoon1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0 ; i<T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N+1];
            for(int j = 0 ; j<N; j++) {
                int rank = sc.nextInt();
                arr[rank] = sc.nextInt();
            }
            int answer = 0;
            answer++;
            int min = arr[1];
            for(int j = 2; j<=N; j++) {
                if(arr[j] < min) {
                    answer++;
                    min = arr[j];
                }
            }
            System.out.println(answer);
        }
        sc.close();
        
    }
}
