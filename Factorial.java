import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	System.out.print("Enter Number: ");
		int x = scn.nextInt();
        int fact = 1;
        for (int i = 0; i < 5; i++) {
            fact = fact * x;
            x--;
        }
        System.out.println("Factorial is: " + fact);
    }
}