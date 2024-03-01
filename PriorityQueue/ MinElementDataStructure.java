import java.util.*;

public class MinElementDataStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        
        // Create a PriorityQueue to store elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            switch(x) {
                case 1:
                    pq.offer(y); // Insert y to the PriorityQueue
                    break;
                case 2:
                    if (pq.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(pq.peek()); // Print the minimum element
                    break;
                case 3:
                    if (!pq.isEmpty())
                        pq.poll(); // Remove the minimum element
                    break;
            }
        }
        
        scanner.close();
    }
}