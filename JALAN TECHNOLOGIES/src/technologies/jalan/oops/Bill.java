package technologies.jalan.oops;

public class Bill {

	public static void generateBill(String fName,String coffee,String addOn){
		float amt=0.00f;
		final float gst= 0.18f;
		if(coffee=="Espresso"&&addOn=="Milk")
			amt = 60;
		else if(coffee=="Espresso"&&addOn=="Cream")
			amt = 75;
		else if(coffee=="Espresso"&&addOn=="Latte")
			amt = 100;
		else if(coffee=="Cappuccino"&&addOn=="Milk")
			amt = 80;
		else if(coffee=="Cappuccino"&&addOn=="Cream")
			amt = 90;
		else if(coffee=="Cappuccino"&&addOn=="Latte")
			amt = 125;
		else if(coffee=="Latte"&&addOn=="Milk")
			amt = 100;
		else if(coffee=="Latte"&&addOn=="Cream")
			amt = 125;
		else if(coffee=="Latte"&&addOn=="Latte")
			amt = 150;
		
		float grandTotal = amt+(amt*gst);
		Print.greet(fName,coffee,addOn);
		Print.receipt(amt,grandTotal,coffee,addOn);
	}
	
}
