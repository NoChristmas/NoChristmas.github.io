package CodingTestStudy;

import java.util.*;
public class baekjoon6603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = null;
        int cnt = 0;
        while(true) {
            cnt++;
            list = new ArrayList<>();
            int N = sc.nextInt();
            
            if(N == 0) break;

            for(int i = 0 ; i<N; i++) {
                int number = sc.nextInt();
                list.add(number);
            }
            
            for(int num1 = 0; num1<N-5; num1++) {
                for(int num2 = num1+1; num2<N-4; num2++) {
                    for(int num3 = num2+1; num3<N-3; num3++) {
                        for(int num4 = num3+1; num4<N-2; num4++) {
                            for(int num5 = num4+1; num5<N-1; num5++) {
                                for(int num6 = num5+1; num6<N; num6++) {
                                    System.out.println(list.get(num1)+" "+list.get(num2)+" "+list.get(num3)+" "+list.get(num4)+" "+list.get(num5)+" "+list.get(num6));
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
