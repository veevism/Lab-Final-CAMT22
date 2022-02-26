package lab17_2401;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> SL = new LinkedList<>();

        SL.add("one");
        SL.add("two");
        SL.add("three");
        SL.add("four");
        SL.add("five");

        System.out.println("Queue line :" + SL);
        System.out.println(SL.remove() + " is out of queue.");
        System.out.println("Now head is " + SL.peek());
        System.out.println("Last person needed to wait " + SL.size() + " queue");
    }
}
