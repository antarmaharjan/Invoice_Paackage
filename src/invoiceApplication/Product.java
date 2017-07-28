package invoiceApplication;

//Creating a  new Product class
public class Product {
	private double price;
	private String description;
	
	public void setPrice(double price){
		this.price = price;		
	}
	public void setDescription(String description){
		this.description = description;
	}
	//Return the product price
	public double getPrice() {
		return price;
	}
	//Return the product description
	public String getDescription() {
		return description;
	}


	
	

}



