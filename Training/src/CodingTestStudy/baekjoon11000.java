package CodingTestStudy;
import java.util.*;
public class baekjoon11000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 갯수
        int[][] times = new int[N][2];
        for(int i=0; i<N; i++) {
            times[i][0] = sc.nextInt(); //시작 시간
            times[i][1] = sc.nextInt(); //끝나는 시간
        }
        // 1. 시간순 정렬
        Arrays.sort(times, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return (o1[0] - o2[0]);
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(times[0][1]);

        // 2. 강의실 개수 구하기
        for(int i = 1; i<N; i++) {
            if(pq.peek() <= times[i][0]) pq.poll();
            pq.add(times[i][1]);
        }
        System.out.println(pq.size());
        System.out.println(pq.toString());
        sc.close();
    }
}