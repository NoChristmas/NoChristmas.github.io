package Programmers.Lv2;

public class JumpTeleport {
    public static void main(String[] args){
            int n = 5000;
            int jump = 1;
            while(n!=1){
                if(n%2==0) {
                    n /=2;
                } else {
                    n = (n-1)/2;
                    jump++;
                }
            }
            System.out.println(jump);
    }
}
