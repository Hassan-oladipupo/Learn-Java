import java.util.PriorityQueue;

public class LearnQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> prioritQueue = new PriorityQueue<>();
        prioritQueue.add(50);
        prioritQueue.add(30);
        prioritQueue.add(10);
        System.out.println("Priority Queue:" + prioritQueue);
    }
}
