import java.util.Scanner;

public class digitsClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputs = input.nextInt();
        for (int i = 0; i < inputs; i++) {
            int a = input.nextInt();
            String s = Integer.toString(a);
            int len = s.length();
            int sum = 0;
            for(int j=0; j<len; j++){
               char c = s.charAt(j);
                sum = sum + Integer.parseInt(String.valueOf(c));
            }
            System.out.println("Sum of the integers: "+sum);
            System.out.println();
        }
    }
}
