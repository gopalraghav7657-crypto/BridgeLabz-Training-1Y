class ControlFlows {
    public static void
	 main(String[] args) {
	  System.out.println("For loop Example:");
	   for(int p = 1; p<=5; p++) {
	     for(int k = 1; k<=5; k++) {
	       System.out.println("*");
	     }
		   System.out.println();
	    }
		System.out.println("Do - while loop Example:");
		
		int j=0;
		do {
		     System.out.println(j);
			 j++;
			 
		}
		while(j<=20);
		
		
		System.out.println("For-Each loop Example:");
		int arr[]  =  {10 ,20 ,30 ,40};
		
		for(int num: arr) {
		  System.out.println(num);
		}
	}
}