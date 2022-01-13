import java.util.LinkedList;
import java.util.Stack;

public class listClass {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.addFirst("Python");
        linkedList.addLast("C++");
        linkedList.add("Ruby");
        System.out.println("LinkedList is: "+ linkedList);
        for(String element: linkedList){
            System.out.println(element);
        }
        System.out.println();

        System.out.println("Stack data structure");
        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(45);
        stack.add(31);
        stack.add(57);
        stack.push(222);
        stack.add(21);
        stack.pop();
        System.out.println("Stack of elements: "+stack);
    }
}
