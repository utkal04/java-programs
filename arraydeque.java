import java.util.ArrayDeque;

class f30
{
    public static void main(String[] args) {
        {
            ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
            adq.offer(1);
            adq.offer(2);
            adq.offer(3);
            System.out.println(adq);
            adq.offerFirst(4);
            adq.offerLast(0);
            System.out.println(adq);
            System.out.println("ELEMENT TO GET OUT:"+adq.peek());
            System.out.println("ELEMENT TO GET OUT first:"+adq.peekFirst());
            System.out.println("ELEMENT TO GET OUT last:"+adq.peekLast());
            System.out.println("ELEMENT REMOVED ACCORDING TO QUEUE:"+adq.poll());
            System.out.println("ELEMENT REMOVED FROM FIRST:"+adq.pollFirst());
            System.out.println("ELEMENT REMOVED FROM LAST:"+adq.pollLast());


        }
    }
}