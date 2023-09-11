package Solving;
import java.util.*;
public class baekjoon9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        
        int result = 0;
        if(N == 1) {
            System.out.println(0);
            return;
        }
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            maxX = Math.max(maxX,a);
            minX = Math.min(minX,a);
            maxY = Math.max(maxY,b);
            minY = Math.min(minY,b);
            
        }
        System.out.println(maxX);
        System.out.println(minX);

        int resultX = Math.abs(maxX-minX);
        int resultY = Math.abs(maxY-minY);
        
        result = resultX*resultY;
        System.out.println(result);
    }
}
