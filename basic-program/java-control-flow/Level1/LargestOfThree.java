import java.util.Scanner;
public class LargestOfThree {
   public static void main(String[] args) {
      Scanner sc = new
	  Scanner(System.in);
	  
	  System.out.println("Enter first number:");
	  int number1 = sc.nextInt();
	  
	  System.out.println("Enter secound number:");
	  int number2 = sc.nextInt();
	  
	  System.out.println("Enter third number:");
	  int number3 = sc.nextInt();
	  
	  if(number1 >= number2 && number1 >= number3) {
	  System.out.println("Yes,the first number the largest: ");
	  }
      else if(number2 >= number1 && number2 >= number3) {
	  System.out.println("Yes, the secound number the largest:");
	  }
	  else {
	  System.out.println("Yes, the third number the largest: ");
	  }
      
	  sc.close();
	  
    }
}