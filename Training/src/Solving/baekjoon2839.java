package Solving;
import java.util.*;
public class baekjoon2839 {
    public static void main(String[] args) {
        //3,5로만 담음...
        Scanner sc = new Scanner(System.in);
        int bongzi = sc.nextInt();
        int cnt = 0;
        
        //최소의 3인 숫자로 나눈 수만큼 돔
        for(int i = 1 ; i<=(bongzi/3); i++) {
            int temp = 0;
            int tmpBongzi = bongzi;
            for(int j = 3; j<=tmpBongzi/3; j +=3) {
                if(tmpBongzi - j >=0) {
                    tmpBongzi -= j;
                    System.out.println("tmp-j = " +tmpBongzi);
                    temp++;
                        for(int k = 5; k<=tmpBongzi/5; k+=5) {
                        if(tmpBongzi - k >=0) {
                            tmpBongzi -=k;
                            System.out.println("tmp-k ="+ tmpBongzi);
                            temp++;
                        }
                    }
                }
            if(tmpBongzi == 0) cnt = Math.max(tmpBongzi,cnt);    
                
            }
        }
        
        System.out.println(cnt);
    }
}
