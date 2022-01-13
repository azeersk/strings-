import java.util.Scanner;

public class addClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputs = input.nextInt();
        for(int i=0; i<inputs; i++){
            int first = input.nextInt();
            int second = input.nextInt();
            System.out.println("Sum of the values: "+ (first + second));
            System.out.println();
        }
    }
}
