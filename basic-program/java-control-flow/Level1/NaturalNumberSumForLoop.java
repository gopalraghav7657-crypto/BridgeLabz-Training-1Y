import java.util.Scanner;
public class NaturalNumberSumForLoop {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		if(n <= 0) {
		System.out.println("The number is not a Natural Number:");
		}
		
		else {
		  int formulaSum = n* (n + 1) / 2;
		
		  int loopSum = 0;
		
		  for(int i = 1; i <= n; i++) {
		   loopSum = loopSum + i;
		  }
		
		  System.out.println("Sum using formula:" + formulaSum);
		  System.out.println("Sum using loop:" + loopSum);
		  
		if(formulaSum == loopSum) {
		System.out.println("Both results are correct and equal:");
		}
		else {
		System.out.println("Results are not equal:");
		}
		
		
	    }
	       sc.close();
	
	}



}