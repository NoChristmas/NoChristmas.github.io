package baekjoonStack;
import java.util.Scanner;
public class boj18532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i<6; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = -999; i<=999; i++) {
            for(int j = -999; j<=999; j++) {
                if(arr[0]*i + arr[1]*j == arr[2] && arr[3]*i + arr[4]*j == arr[5]) {
                    System.out.print(i+ " "+j);
                    break;
                }
            }
        }
    }
}
