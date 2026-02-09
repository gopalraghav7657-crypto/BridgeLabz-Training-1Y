import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		System.out.println("Enter your salary:");
		double salary = sc.nextInt();
		
		System.out.println("Enter your years of service:");
		int years = sc.nextInt();
		
		double bonus = 0;
		
		if(years > 5) {
		   bonus = salary * 0.05;
		   
		System.out.println("You are eligible for bonus:");   
		}
	    else {
		System.out.println("You are not eligible for bonus:");
		}
		
		System.out.println("Bonus Amount:" + bonus);
		
		sc.close();
	
	}


}