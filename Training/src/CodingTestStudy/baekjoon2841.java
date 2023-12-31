package CodingTestStudy;
import java.util.*;
public class baekjoon2841 {
    public static void main(String[] args) {
        //프랫의 조건은 높을시에 낮은것들은 무시가 되며, 낮은걸 연주할 때는 높은거는 없어야함
        //그 값들이 최소가 되는 조건을 구하라...
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //프랫을 입력받을 개수
        int P = sc.nextInt(); //프랫의 최대 값
    
        Stack<Integer>[] st = new Stack[N+1];
        for(int i = 1; i <N+1; i++) {
            st[i] = new Stack<>();
        }
        
        int result = 0;
        for(int i = 0; i<N; i++) {
            int line = sc.nextInt();
            int flat = sc.nextInt();
            
            if(st[line].isEmpty()) {
                st[line].push(flat);
                result++;
                continue;
            } 
            
            if(st[line].peek() < flat) { //플랫을 올려 쌓으면 됨
                st[line].push(flat);
                result++;
            } else if (st[line].peek() > flat) { //플랫이 낮을 경우 손가락을 떼어야 함
                int length = st[line].size()+1;
                for(int j = 0; j<length; j++) { //stack을 탐색 시작
                    if(st[line].isEmpty() || st[line].peek() < flat) { //stack의 제일 마지막 값과 비교
                        st[line].push(flat);
                        result++;
                        break;
                    } else if (st[line].peek() > flat) {
                        st[line].pop(); //Stack을 꺼냄
                        result++; //result 더하기
                    }
                }
                
            }
        }
        
        System.out.println(result);
        
    }
}
