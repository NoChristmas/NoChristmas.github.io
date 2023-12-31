package baekjoonStack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class boj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(Solution(N));
    }

    public static int Solution(int a) {
        if(a==4 || a== 7) {
            return -1;
        } 
        if(a%5 == 0) {
            return a/5;
        } else if(a%5 == 1 || a%5 == 3) {
            return (a/5)+1;
        } else if(a%5 == 2 || a%5 == 4) {
            return (a/5)+2;
        }
        return -1;
    }
}
