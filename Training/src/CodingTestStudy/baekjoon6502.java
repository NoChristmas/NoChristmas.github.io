package CodingTestStudy;
import java.util.*;
public class baekjoon6502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true) {
            cnt++;
            //테이블은 원형
            int r = sc.nextInt(); // 반지름
            if(r == 0) return;
            //밑에는 피자 (사각형)
            int w = sc.nextInt(); // pizza width
            int l = sc.nextInt(); // pizza height
            
            double table = r*2;
            double pizza = Math.sqrt((w*w)+(l*l));
            if(table >=pizza) System.out.println("Pizza "+cnt+" fits on the table.");
            else System.out.println("Pizza "+cnt+" does not fit on the table.");
        }
        
    }    
}
