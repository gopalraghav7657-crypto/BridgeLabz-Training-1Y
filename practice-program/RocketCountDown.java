import java.util.Scanner;
public class RocketCountDown {
    public static void main(String[] args) {
	    Scanner sc = new
	    Scanner(System.in);
	
	    System.out.println("Enter the countdown number:");
	    int counter = sc.nextInt();
	
	    if(counter <= 0) {
	    System.out.println("Please enter a positive number:");
	    }
		
		else {
		while(counter >= 1) {
		System.out.println(counter);
		    counter--;
		}
		
		System.out.println("Rocket Launch Successful:");
		}
		
		sc.close();
	}
}