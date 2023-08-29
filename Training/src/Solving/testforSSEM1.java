package Solving;
import java.util.Scanner;

public class testforSSEM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //10000000 > 10,000,000으로 출력 되게...
        int length = str.length();
        int dotsNumber = length/3;
        int leaves = length%3;
        
        String temp="";
        int count = leaves;
        for(String arr : str.split("")) {
            
            if(count == 0) {
                count = 3;
                temp +=",";
            }
            temp += arr;
            count --;
        }
        if(temp.substring(0,1).equals(",")) {
            temp = temp.substring(1,temp.length());
        }
        System.out.println(temp);
    }    
}
