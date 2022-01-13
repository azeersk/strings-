import java.util.Scanner;

public class ATMClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the draw balance: ");
        int drawAmount = input.nextInt();

        System.out.print("Enter account balance: ");
        int balance = input.nextInt();
        System.out.println();
        if(drawAmount > balance){
            System.out.println("Insufficient balance: "+balance);
        }
        else{
            int current = balance - drawAmount;
            System.out.println("Successfully deducted: "+ drawAmount);
            System.out.println("Current account balance: "+(current- 0.50));
        }

    }
}
