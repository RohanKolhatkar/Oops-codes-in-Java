// 12/04/2022
import java.util.*;
//dequeue 
public class doublequeue {
    public static void main(String[] args){
        // Queue<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.addFirst(564); // it is a function of ArrayDeque so it will nit work for Queue type
        queue.addLast(14);

        System.out.println("head element using get first" + queue.getFirst());
        System.out.println("head element using get last"+queue.getLast());
    
    
    }

    
}
