import java.util.Scanner;
public class SmallestCheck {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		System.out.println("Enter first number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the secound number:");
		int number2 = sc.nextInt();
		
		System.out.println("Enter the third number:");
		int number3 = sc.nextInt();
		
		if(number1 < number2 && number1 < number3) {
		
		System.out.println("Yes, the first number is the smallest:");
		
		}
	    else {
		System.out.println("No, the first number is not the smallest:");
		}
		
		sc.close();
	}
}