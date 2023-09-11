package Solving;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class testForSSEM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("지금 시간 입력 (hhmmss):");
        String currentTime = sc.next();
        System.out.print("초과 시간 입력 :");
        String addTime = sc.next();

        System.out.println("현재 시간 :"+currentTime+"/ 초과 시간 :"+addTime);
        String totalTime = "";
        
        int currentHour = Integer.parseInt(currentTime.substring(0,2));
        int currentMin = Integer.parseInt(currentTime.substring(2,4));
        int currentSec = Integer.parseInt(currentTime.substring(4,6));
        
        int addMin = Integer.parseInt(addTime.substring(0,2));
        int addSec = Integer.parseInt(addTime.substring(2,4));

        int totalHour = 0;
        int totalMin = 0;
        int totalSec = (addSec+currentSec);
        if(totalSec >= 60) {
            totalSec %= 60;
            totalMin++;
        }
        totalMin += (addMin+currentMin);
        if(totalMin >= 60) {
            totalMin %= 60;
            totalHour++;    
        }
        
        totalHour += (currentHour);
        totalHour %= 24;

        totalTime +=String.valueOf(totalHour)+String.valueOf(totalMin)+String.valueOf(totalSec);
        System.out.println(totalTime);
    }
}