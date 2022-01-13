import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class arrayClass {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("java");
        linkedList.add("python");
        linkedList.add("oracle");
        linkedList.add("c++");
        linkedList.add("javascript");
        linkedList.add("ruby");

        System.out.println();
        String[] arr = new String[linkedList.size()];

        for(int i=0; i<linkedList.size(); i++){
            arr[i] = linkedList.get(i);
        }
        System.out.println("LinkedList is: "+ Arrays.toString(arr));


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(linkedList);
        String arList = arrayList.toString();
        System.out.println("ArrayList to String: "+ arList);
        List<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        System.out.println("ListOne: "+listOne);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(2);
        listTwo.add(4);
        listTwo.add(6);
        listTwo.add(8);
        System.out.println("ListTwo: "+listTwo);

        List<Integer> listThree = new ArrayList<>();
        listThree.addAll(listOne);
        listThree.addAll(listTwo);
        System.out.println("Merge two lists: "+ listThree);

    }
}
