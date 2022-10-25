package technologies.jalan.oops;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Coffee House!!!");
		System.out.println("Enter your First name: ");
		String fName = sc.next();
		String addOn = "",coffee = "";
		boolean flag = false;
		int option;
		while(!flag) {
		System.out.println("\nPlease select a coffee from the list below: "+"\n1.Espresso\n2.Cappuccino\n3.Latte\n4.Exit");

	
		option = sc.nextInt();
		switch(option) {
		case 1: {
			coffee = "Espresso";
			break;
		}
		case 2: {
			coffee = "Cappuccino";
			break;
		}
		case 3: {
			coffee = "Latte";
			break;
		}
		case 4: {
			flag=true;
			break;
		}
		default:
			System.out.println("Enter a valid option!!!");
		}
		if(!flag) {
		System.out.println("\nPlease select an add-on with your coffee: "+"\n1.Milk\n2.Cream\n3.Latte\n4.Exit");
		
		option = sc.nextInt();
		switch(option) {
		case 1: {
			addOn = "Milk";
			break;
		}
		case 2: {
			addOn = "Cream";
			break;
		}
		case 3: {
			addOn = "Latte";
			break;
		}
		case 4: {
			flag = true;
			break;
		}
		default:
			System.out.println("Enter a valid option!!!");
		}
		}
		
		if(!flag)
		Bill.generateBill(fName,coffee,addOn);
}
		System.out.println("\nThank you for choosing us!\nHave a great day!");
		sc.close();
	}



}
