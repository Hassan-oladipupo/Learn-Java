import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class LearnQueue {
    public static void main(String[] args){

        // Priority Queue
        PriorityQueue<Integer> prioritQueue = new PriorityQueue<>();
        prioritQueue.add(50);
        prioritQueue.add(30);
        prioritQueue.add(10);
        System.out.println("Priority Queue:" + prioritQueue);

        // to get the head priority element
        int headPriorityElement = prioritQueue.peek();
        System.out.println("The head priority element is " + headPriorityElement);

        // to  remove the head priority element
        if(!prioritQueue.isEmpty()){
            int removePriorityElement =  prioritQueue.poll();
            System.out.println("The removed priority element is  " + removePriorityElement);
        }




        // Array Deque
        ArrayDeque<String>  newArrayDeque = new ArrayDeque<>();
        newArrayDeque.addFirst("First");
        newArrayDeque.addLast("Second");
        newArrayDeque.addLast("Third");
        newArrayDeque.addLast("Fourth");

        for(String item : newArrayDeque){
            System.out.println(item);
        }

        //to remove the first item
        String removedFirstItem = newArrayDeque.removeFirst();
        System.out.println("The removed item is " + removedFirstItem);

        //to remove the last item
        String removedLastItem = newArrayDeque.removeLast();
        System.out.println("The removed item is " + removedLastItem);

        // to get the head item
        String headItem = newArrayDeque.peekFirst();
        System.out.println("The head item is " + headItem);

        // to get the last item
        String lastItem = newArrayDeque.peekLast();
        System.out.println("The last item is " + lastItem);


    }
}
