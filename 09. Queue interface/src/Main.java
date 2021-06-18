import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Queue adalah implementasi struktur data antrian / FIFO
        //(First In First Out), class di queue :
        //ARRAY DEQUE:menggunakan array
        //LINKED LIST:menggunakan double linked list
        //PRIORITY QUEUE:menggunakan array, namun diurutkan menggunakan comparator

        System.out.println("ARRAY DEQUE");
        Queue<String> queue = new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            queue.add(String.valueOf(i));
        }

        for (String next = queue.poll();next!=null;next=queue.poll()){
            System.out.println(next);
            System.out.println("size: "+queue.size());
        }

        System.out.println("PRIORITY QUEUE");
        Queue<String> pqueue = new PriorityQueue<>();
        pqueue.add("Arfian");
        pqueue.add("Rafi");
        pqueue.add("Pradana");

        for (String next = pqueue.poll();next!=null;next=pqueue.poll()){
            System.out.println(next);
            System.out.println("size: "+pqueue.size());
        }

        System.out.println("LINKED LIST QUEUE");
        Queue<String> lqueue = new LinkedList<>();
        lqueue.add("Arfian");
        lqueue.add("Rafi");
        lqueue.add("Pradana");

        for (String next = lqueue.poll();next!=null;next=lqueue.poll()){
            System.out.println(next);
            System.out.println("size: "+lqueue.size());
        }
    }
}
