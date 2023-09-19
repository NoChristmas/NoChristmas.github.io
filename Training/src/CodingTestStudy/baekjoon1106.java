package CodingTestStudy;

import java.util.*;
public class baekjoon1106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int N = sc.nextInt();
        
        List<Integer> srcList = new ArrayList<>();
        List<Integer> profitList = new ArrayList<>();
        List<Double> profit = new ArrayList<>();
        
        for(int i = 0; i<N; i++) {
            srcList.add(sc.nextInt());
            profitList.add(sc.nextInt());
            profit.add((double)profitList.get(i)/(double)srcList.get(i));
        }
        
        int cost = C;
        int result = 0;
    }
}
