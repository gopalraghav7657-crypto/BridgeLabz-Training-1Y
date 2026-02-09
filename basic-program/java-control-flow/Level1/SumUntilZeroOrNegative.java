import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		double total = 0.0;
		double number;
		
		while(true) {
		System.out.println("Enter a number(0 or negative to stop):");
		number = sc.nextDouble();
		
		    if(number <= 0) {
			   break;
			
			}
			
			total = total + number;
		
		}
		
		System.out.println("The sum is:" + total);
		
		sc.close();
	
	}


}