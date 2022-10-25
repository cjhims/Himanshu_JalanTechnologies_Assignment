package technologies.jalan.oops;

public class Print {

	public static void greet(String fName,String coffee,String addOn){
		System.out.println("Hi, "+fName);
		System.out.println("You have ordered "+coffee+" with "+addOn);
		System.out.println("Here is your detailed receipt for the above order:\n");
		
	}
	
	public static void receipt(float amt,float grandTotal,String coffee,String addOn){
		System.out.println(coffee+"+"+addOn+": "+amt+" Rs.");
		System.out.println("Total: "+amt+" Rs.");
		System.out.println("GST "+"18%");
		System.out.println("Grand Total: "+grandTotal+" Rs.");
	}
}
