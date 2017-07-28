package invoiceApplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Invoice_App {
	
	/**
	 * This is an invoice project to calculate the  price of the item,tax amount
	 * and final total cost on the base of user's response.
	 * The details are below: 
	 * 
	 * @author antarmaharjan
	 ***/

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//initialize the scanner object
		double taxRate;
		boolean addedProducts = true; // set to false if user chooses not to continue
		List<Product> products = new ArrayList<Product>(); // Stores all users products

		double taxAmt = 0; //tax amount
		double totalAmt = 0; // total amount before tax
		double finalAmt = 0; // final amount including tax

		System.out.println("What is the tax rate (assume: 2 means 2%): ");
		taxRate = scn.nextDouble();		
		scn.nextLine();
		
		// continue user prompt for more products until response comes 'no'		
		do {
			// create a new product object
			Product currentProduct = new Product();

			// add it to our product list
			products.add(currentProduct);
			//prompt the user for product price
			System.out.println("what is the product price? ");
			//store the product price
			currentProduct.setPrice(scn.nextDouble());
			scn.nextLine();
			// prompt the user for product description
			System.out.println("Enter the description of product: ");
			//Store the product description
			currentProduct.setDescription(scn.nextLine());			
			// ask if user wants to add more products
			System.out.println("Do you want to add another product? Y/N");			
			addedProducts = scn.nextLine().equalsIgnoreCase("y") ? true : false;			
		} while (addedProducts);
		System.out.println("----------------Thank you for doing business with us!-------------------");
		System.out.println("Your detail purchase information is as below:-");

		// get all user prompts and display the product info
		for (Product p : products) {
			totalAmt += p.getPrice();			
			System.out.println("Product price is $ "+ + p.getPrice());
		}

		// calculate the tax amount
		taxAmt = totalAmt * taxRate/100;

		// calculates final total amount
		finalAmt = totalAmt + taxAmt;
		System.out.println("your tax rate is "+taxRate+ "%");
		// prints tax and final total amount		
		System.out.println("Total Tax charged is $ " + taxAmt);
		System.out.println("Final total Amount is $ " + finalAmt);

	}

}

	


