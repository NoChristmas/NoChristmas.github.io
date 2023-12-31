package baekjoonStack;

import java.util.LinkedList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String temp = st.nextToken();

            if(temp.equals("push")) {
                
                list.add(Integer.parseInt(st.nextToken()));
            } else if(temp.equals("pop")) {
                if(list.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(list.poll()).append("\n");
                }
            } else if(temp.equals("size")) {
                sb.append(list.size()).append("\n");
            } else if(temp.equals("empty")) {
                if(list.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(temp.equals("front")) {
                if(list.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(list.peek()).append("\n");
                }
            } else if(temp.equals("back")) {    
                if(list.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(list.get(list.size()-1)).append("\n");
                }
            } else {
                continue;
            }
        }
        System.out.print(sb);
    }
}