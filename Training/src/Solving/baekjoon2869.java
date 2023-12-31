package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long up = Long.parseLong(st.nextToken());
        long down = Long.parseLong(st.nextToken());
        long height = Long.parseLong(st.nextToken());
        long curHeight = 0;
        long cntDays = 0;
        while(true) {
            cntDays++;
            curHeight += up;
            if(curHeight >= height) {
                break;
            }
            curHeight -= down;
        }
        System.out.println(cntDays);

    }    
}
