import java.util.Scanner;

public class remainderClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputs = input.nextInt();
        for(int i=0; i<inputs; i++){
            int first = input.nextInt();
            int second = input.nextInt();
            System.out.println("Reminder is: "+ first%second);
        }
    }
}
