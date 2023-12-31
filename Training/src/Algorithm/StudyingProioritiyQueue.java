package Algorithm;
import java.util.PriorityQueue;
import java.util.Collections;
public class StudyingProioritiyQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pql = new PriorityQueue<>();
        PriorityQueue<Integer> pqh = new PriorityQueue<>();

        pql.add(1);
        pql.add(10);
        pql.offer(100);

        pqh.add(100);
        pqh.add(10);
        pqh.add(1);

        System.out.println(pqh.toString());
        System.out.println(pqh.poll());
        System.out.println(pqh.poll());
    }
}
