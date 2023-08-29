package Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ComparatorTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("이걸",2);
        map.put("최대한",5);
        map.put("정렬해보자",0);
        
        List<String> list = new ArrayList<>(map.keySet());
        
        //Value 값으로 오름차순 정렬
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return Integer.compare(map.get(o1), map.get(o2));
            }
        });

        System.out.println(list.toString());
    }
}
