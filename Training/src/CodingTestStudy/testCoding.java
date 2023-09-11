package CodingTestStudy;
import java.util.*;
public class testCoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> books =new ArrayList<>();
        List<Integer> minusList = new ArrayList<>();
        List<Integer> plusList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            books.add(sc.nextInt());
        }
        Collections.sort(books);
        
        for(int i = 0; i<N; i++) {
            if(books.get(i)<0) minusList.add(books.get(i));
            else if(books.get(i) >= 0) plusList.add(books.get(i));
        }
        int maxDistance = Math.max(Math.abs(books.get(0)),Math.abs(books.get(books.size()-1)));
        
        System.out.println(books.toString());
        //90 + 
    }
}