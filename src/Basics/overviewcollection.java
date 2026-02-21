package Basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class overviewcollection {

    // collection is the inbuilt DS of java 
    
    public static void main(String[] args) {

        // Linked list

        LinkedList<Integer> list =new LinkedList<>();
        list.add(100);
        list.add(45);
        list.add(165);
        list.add(145);
        list.add(252);

        System.out.println("Linked list " + list);


        //Stack LIFO

        Stack<Integer> stack = new Stack<>();
        stack.push(454);
        stack.push(500);
        stack.push(486);

        System.out.println("Stack " + stack);
        System.out.println("Stack " + stack.pop());
        System.out.println("Stack " + stack.peek());

        //Queue FIFO

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(478);
        queue.offer(987);
        queue.offer(200);

        System.out.println(queue);
        System.out.println("peek " + queue.peek());
        System.out.println("poll " + queue.poll());
        System.out.println("peek " + queue.peek());

        System.out.println(queue); 
   }

}
