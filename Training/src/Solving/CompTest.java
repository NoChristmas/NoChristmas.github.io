package Solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("김",3);
        map.put("최",22);
        map.put("박",4);
        map.put("이",0);
        
        List<String> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2){
            return Integer.compare(map.get(o1),map.get(o2));
            } 
        });

        for(String key : list) {
            System.out.println("key = "+key);
            System.out.println("value = "+map.get(key));
        }
    }
    
}
