import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //deque singkatan dari double ended queue (bisa dari depan dan belakang)
        //deque = FIFO(first in first out) dan LIFO(last in first out)
        //bisa dibilang deque adalah implementasi strukturdata antrian dan stack(tumpukan)

        Deque<String> stack = new LinkedList<>();
        stack.offerFirst("Arfian");
        stack.offerLast("Rafi");
        stack.offerFirst("Pradana");

        for (var k :
                stack) {
            System.out.println(k);
        }
        System.out.println(stack.pollFirst());
    }
}
