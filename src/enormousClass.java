import java.util.Scanner;

public class enormousClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("number of inputs: ");
        int inputs = input.nextInt();
        System.out.println("number of dividers: ");
        int div = input.nextInt();
        int count = 0;
        for(int i=0; i<inputs; i++){
            int num = input.nextInt();
            if(num%div==0){
                count++;
            }
        }
        System.out.println("dividers of "+ div + ": "+count);
    }
}
