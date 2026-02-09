import java.util.Scanner;
public class MultiplesWhileLoop {
   public static void main(String[] args) {
       Scanner sc = new
	   Scanner(System.in);
	   
	   System.out.println("Enter a number:");
	   int number = sc.nextInt();
	   
	   if(number > 0 && number < 100) {
	   int counter = number - 1;
	   
	   System.out.println("Multiples of" + number + "below 100:");
	   
	       while(counter > 1) {
		      if(counter % number == 0) {
			  System.out.println(counter);
			  }
			      counter--;
		   }
		   
	   } 
       else {
	   System.out.println("Please enter a positive number less than 100:");
	   }
	   
	      sc.close();
   }

}