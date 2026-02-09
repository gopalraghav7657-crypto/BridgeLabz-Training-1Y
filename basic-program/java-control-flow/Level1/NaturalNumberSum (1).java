import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		if(n > 0) {
		int i = 1;
		int sumWhile = 0;
		
		   while (i <= n) {
		     sumWhile = sumWhile + i; i++;
		   }
		   
		   int sumFormula = n*(n + 1) / 2;
		   
		   System.out.println("Sum using while loop = " + sumWhile);
		   System.out.println("Sum using formula = " + sumFormula);
		   
		   if(sumWhile == sumFormula) {
		   
		   System.out.println("Both results are correct and equal:");
		   }
		   else {
		   System.out.println("Results are not equal:");
		   }
		   
		}
		   else {
		   System.out.println("The number is not a natural number:");
		   }
		   
		   sc.close();
	
	}


}