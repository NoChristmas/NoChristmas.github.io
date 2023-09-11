package CodingTestStudy;
import java.util.*;
public class baekjoon18429 {
    
    static int N; //배열의 길이
    static int K; //매번 감소가 되는 값
    static boolean[] visited; //visited 처리
    static int[] arr; //운동기구 (+ 해줄놈)
    static int cnt; //정답 print 할 놈
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); 
        K = sc.nextInt();
        visited = new boolean[N];
        arr = new int[N];

        for(int i = 0; i < N; i++) { //
            arr[i] = sc.nextInt();    
        }
        count = 0;
        cnt = 0;
        backtracking(500,0);
        System.out.println(cnt);
        }
    
    static void backtracking(int currentWeight, int depth) {
        //최소로 줄여야 하므로 근손실나면 그냥 종료 시켜버림
        if(currentWeight < 500) return; 

        if (depth == N) { // 재귀함수 종료 조건 
            cnt++; //depth의 값이 limit에 왔으므로 성공
            return ;
        } 

        for(int i = 0; i<N; i++) {
            if(!visited[i] && currentWeight >=500) {
            visited[i] = true; // 방문 처리
            backtracking(currentWeight-K+arr[i], depth+1);
            visited[i] = false; // cnt 얻어냈으면 다시 초기화
            }
        }
    }
}
