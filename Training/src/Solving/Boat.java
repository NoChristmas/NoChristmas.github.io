package Solving;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Boat {
    public static void main(String[] args) {
        int[] people = { 70, 80, 50 };
        int limit = 100;
       
        
        Arrays.sort(people);
        int index = 0;
        int answer = 0;
        //index값
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}
