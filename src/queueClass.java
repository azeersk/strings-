import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueClass {
    public static void main(String[] args){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("linux");
        queue.add("kali");
        queue.add("windows");
        queue.add("mac");
        queue.offer("adm");
        System.out.println(queue);

        //middle element of LinkedList using the LinkedList class
        System.out.println();
        LinkedList<String> listOf = new LinkedList<>();
        listOf.addAll(queue);
        int len = listOf.size();
        System.out.println("middle element is: "+ listOf.get(len/2));

    }
}
