package baekjoonStack;
import java.io.*;
public class boj5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int adds = 1;
        int result = 0;
        char[] ch = str.toCharArray();
        //A 는 65
        for(int i =0; i<ch.length; i++) {
            if(ch[i]>=65 && ch[i] <=67) { //ABC
                result += 3;
            } else if(ch[i] >=68 && ch[i] <=70) { //DEF
                result += 4;
            } else if(ch[i] >=71 && ch[i] <=73) { //GHI
                result +=5;
            } else if(ch[i] >=74 && ch[i] <=76) { //JKL
                result +=6;
            } else if(ch[i] >=77 && ch[i] <=79) { //MNO
                result +=7;
            } else if(ch[i] >=80 && ch[i] <=83) { //PQRS
                result +=8;
            } else if(ch[i] >=84 && ch[i] <=86) { //TUV
                result +=9;
            } else if(ch[i] >=87 && ch[i] <=90) { //WXYZ
                result +=10;
            } 
        }
        System.out.println(result);
    }
}
