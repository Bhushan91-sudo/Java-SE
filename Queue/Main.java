import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); //Number of queries
        Queue<Integer> queue = new ArrayDeque<>(); //Creat a queue
        
        while (Q--> 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if (x == 1) {
                //Push y to the back of the queue
                queue.offer(y);
            } else if (x == 2) {
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if (x == 3) {
                //Remove the front element of the queue if not isEmpty
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }
        scanner.close();
        
        
    }
}