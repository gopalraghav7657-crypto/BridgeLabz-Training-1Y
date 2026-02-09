import java.util.Scanner;
public class FactorialUsingForLoop {
    public static void main(String[] args) {
	   Scanner sc = new
	   Scanner(System.in);
	   
	   System.out.println("Enter a number:");
	   int num = sc.nextInt();
	   
	   if(num <= 0) {
	   System.out.println("Please enter a natural number (greater then 0):");
	   }
	   
	   else {
	      long factorial = 1;
	      for(int i = 1; i <= num; i++) {
		  factorial = factorial * i;
		  }
	   
	   System.out.println("Factorial of " + num + "is:" + factorial);
	   }
	
	     sc.close();
	}



}