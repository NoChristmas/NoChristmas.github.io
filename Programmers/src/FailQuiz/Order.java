package FailQuiz;

import java.util.Map;
import java.util.HashMap;

public class Order {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        int foods = 22000+9500+25900;
        int[] drinks = new int[5];
        drinks[0] = 7000;   //김정연
        drinks[1] = 7000;   //박정호
        drinks[2] = 3500;   //김정은
        drinks[3] = 3500;   //김체은
        drinks[4] = 3500;   //전장근
        foods /= 5;
        
        map.put("김정연",foods+drinks[0]);
        map.put("박정호",foods+drinks[1]);
        map.put("김정은",foods+drinks[2]);
        map.put("김체은",foods+drinks[3]);
        map.put("전장근",foods+drinks[4]);

        for(String key : map.keySet()){
            System.out.printf(key +"씨 금액 : %,d원 \n", map.get(key));
        }
    }
}
