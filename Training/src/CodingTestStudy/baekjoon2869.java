package CodingTestStudy;
import java.util.*;
public class baekjoon2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long up = sc.nextLong();
        long down = sc.nextLong();
        long goal = sc.nextLong();
        long parent = up-down;
        long child = goal-down;
        long day = child/parent;
        if(child%parent != 0) day++;
        
        //1 = 4
        //ad-bd >= 5 -b
        //5 >= 10 
        //100d-99d >= 1000000000 - 99

       System.out.println(day);
    }
}