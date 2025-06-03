package SpringExe.SpringThree;

public class Price {

	String mobileShop;
	int mobilePrice;
	public String getMobileShop() {
		return mobileShop;
	}
	public void setMobileShop(String mobileShop) {
		this.mobileShop = mobileShop;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	
	public void displayPrice()
	{
		System.out.println("mobileShop"+mobileShop+"mobilePrice"+mobilePrice);
	}
}
