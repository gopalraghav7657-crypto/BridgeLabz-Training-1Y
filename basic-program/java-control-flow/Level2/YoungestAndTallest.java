import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
	    Scanner sc = new
		Scanner(System.in);
		
		System.out.println("Enter Amar's age:");
		int ageAmar = sc.nextInt();
		
		System.out.println("Enter Akbar's age:");
		int ageAkbar = sc.nextInt();
		
		System.out.println("Enter Anthony's age:");
		int ageAnthony = sc.nextInt();
		
		System.out.println("Enter Amar's height (in cm):");
		double heightAmar = sc.nextDouble();
		
		System.out.println("Enter Akbar's height (in cm):");
		double heightAkbar = sc.nextDouble();
		
		System.out.println("Enter Anthony's height (in cm):");
		double heightAnthony = sc.nextDouble();
		
		String youngest; 
		if(ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
		youngest = "Amar";
		}
	    
		else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
		    youngest = "Akbar";
		}
		else {
		youngest = "Anthony";
		}
		
		  String tallest;
		  if(heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
		        tallest = "Amar";
		  }
		  
		  else if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
		        tallest = "Akbar";
		  }
		  else {
		        tallest = "Anthony";
		  }
		  
		  System.out.println("\nYoungest Friend:" + youngest);
		  System.out.println("Tallest Friend:" + tallest);
		  
		  sc.close();
	}

}