package Solving;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;

public class getBoodaeJjigae {
    public static void main(String[] args) {
        int location = 1;
        int[] priorities = {4,2,9,1,4};
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) { 
            System.out.println(priority);
            queue.add(priority);
            priorityQueue.add(priority);
        }
        
        /*
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int highestPriority = priorityQueue.peek();
            
            if (current < highestPriority) {
                queue.add(current);
                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location--;
                }
            } else {
                priorityQueue.poll();
                answer++;
                if (location == 0) {
                    break;
                } else {
                    location--;
                }
            }
        }
        System.out.println(answer);

        */
    }
    
}
