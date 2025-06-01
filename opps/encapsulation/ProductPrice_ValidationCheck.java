package com.opps.encapsulation;

class Product{
	private double price;
	
	public void setPrice (double price) {
		if(price > 0) {
			this.price= price;
		}
		else {
			System.out.println("Invalid price.must be>0.");
			
		}
	}
	
	public double getPrice() {
		return price;
	}
	
}












public class ProductPrice_ValidationCheck {

	public static void main(String[] args) {
		
		Product p = new Product();
		p.setPrice(-29);
		p.setPrice(159.97);
		
		System.out.println("Product price : " + p.getPrice());
 
	}

}
