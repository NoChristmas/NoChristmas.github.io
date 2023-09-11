package CodingTestStudy;
import java.util.*;
public class baekjoon2596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String,String> map = new HashMap<>();
        
        String[] key = {"A","B","C","D","E","F","G","H"};
        String[] code = {"000000","001111","010011","011100","100110","101001","110101","111010"};

        String[] arr = new String[N];
        String str = sc.next();
        String result = "";
        
        for(int i = 0; i<N; i++) {
            arr[i] = str.substring(i*6,(i+1)*6);
        }

        for(int i = 0; i<N; i++) {
            boolean flag = true;
            
            for(int j = 0; j < 8; j++) {
                
                if(arr[i].equals(code[j])) { //완전히 같을 때
                    result += key[j];
                    flag = true;
                    break;

                } else {
                    int cnt = 0; //틀린 갯수 판별 count
                    
                    for(int k = 0; k < 6; k++) {
                        if(code[j].charAt(k) != arr[i].charAt(k)) { 
                            if (cnt >= 1) { //나가리 조건문
                                flag = false;
                                break;
                            }
                            cnt++; //한번만 봐주는 count
                        } else { //문자가 같을 경우
                            flag = true;
                        }
                    } //end of code index routine
                    
                    //인덱스 별 true 로 남아있는 지 확인
                    if(flag) { //알파뱃 배열 중에 true 탐색이 끝나면 추가하고 점음
                        result += key[j];
                        break;
                    }
                }
            } //end of 일치 코드 확인
            
            if(!flag) { // if else 문 지나고도 아무것도 못찾으면 index 보여주고 끝
                System.out.println(i+1);
                return;
            }
        } //return을 피했으면 result를 불러오자...
        System.out.println(result);
    }    
}
