package CodingTestStudy;
import java.util.*;
public class baekjoon15947 { // fail
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //length = 14
        String lyrics = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan";
        String[] arr = lyrics.split(" ");
        String result = "";
        int index = (N-1)%14;
        int round = (N-1)/14;
        
        if(index == 2 || index == 6 || index == 10) { //tururu 인 경우
            if(round < 3) {
                result = arr[index];
                for(int i = 0; i<round; i++) {
                    result+="ru";
                }
                System.out.println(result);
            } else {
                System.out.println("tu+ru*"+(round+2));
            }
        } else if (index == 3 || index == 7 || index == 11) { //turu 인 경우
            if(round <4) {
                result = arr[index];
                for(int i = 0; i<round; i++) {
                    result += "ru";
                }
                System.out.println(result);
            } else {
                System.out.println("tu+ru*"+(round+1));
            }
        } else {
            System.out.println(arr[index]);
        }

    }
}
