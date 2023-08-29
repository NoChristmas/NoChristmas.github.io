package Solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        
        ArrayList<Integer> crane = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            crane.add(scan.nextInt());
        }
        Collections.sort(crane, Collections.reverseOrder());
        
        int m = scan.nextInt();
        ArrayList<Integer> box = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            box.add(scan.nextInt());
        }
        Collections.sort(box, Collections.reverseOrder());
        
        if(crane.get(0) < box.get(0)) System.out.println("-1");
        //8 5 2
        //5 4 3 2 1
        else {
            int time = 0;
            while(!box.isEmpty()) {
                int idx = 0; //박스의 index
                for(int i = 0; i < crane.size();) {
                    if(idx == box.size()) break; //outOfBoundException 방지
                    else if(crane.get(i) >= box.get(idx)) { //
                        box.remove(idx);
                        i++;
                    }
                    else idx++;
                }
                time++;
            }
            System.out.println(time);
        }
    }
}
