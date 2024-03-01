import java.util.*;

public class DequeOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            switch(x) {
                case 1:
                    deque.addLast(y);
                    break;
                case 2:
                    deque.addFirst(y);
                    break;
                case 3:
                    if (!deque.isEmpty())
                        System.out.println(deque.peekFirst());
                    else
                        System.out.println(-1);
                    break;
                case 4:
                    if (!deque.isEmpty())
                        System.out.println(deque.peekLast());
                    else
                        System.out.println(-1);
                    break;
                case 5:
                    if (!deque.isEmpty())
                        deque.pollFirst();
                    break;
                case 6:
                    if (!deque.isEmpty())
                        deque.pollLast();
                    break;
            }
        }
        
        scanner.close();
    }
}