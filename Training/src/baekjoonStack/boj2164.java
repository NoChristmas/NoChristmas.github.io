package baekjoonStack;

import java.util.LinkedList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i<=N; i++) {
            list.add(i);
        }
        if(N == 1) {
            System.out.println(1);
            return;
        }
        while(true) {
            if(list.size() == 1) {
                System.out.println(list.poll());
                break;
            }
            list.poll();
            list.add(list.poll());
        }
    }
}
