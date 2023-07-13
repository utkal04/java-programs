import java.util.PriorityQueue;
import java.util.Queue;

class f29
{
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<Integer>();
        pq.offer(23);
        pq.offer(11);
        pq.offer(22);
        pq.offer(3);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}