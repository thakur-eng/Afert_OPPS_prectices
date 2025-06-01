package com.opps;

public class Constructor1 {

	String mobile;
	int Price;

	Constructor1(String _mobile, int _price) {
		this.mobile = _mobile;

		this.Price = _price;

	}

	public static void main(String[] args) {
		System.out.println("lats start now we are creating object ");

		Constructor1 brand = new Constructor1("Apple", 110000);
		System.out.println(brand.mobile + " " + brand.Price);

		Constructor1 brand1 = new Constructor1("Mi", 10000);
		System.out.println(brand1.mobile + " " + brand1.Price);

		Constructor1 brand2 = new Constructor1("Opo", 15000);
		System.out.println(brand2.mobile + " " + brand2.Price);

		Constructor1 brand3 = new Constructor1("vivo", 30000);
		System.out.println(brand3.mobile + " " + brand3.Price);

		Constructor1 brand4 = new Constructor1("nokia", 25000);
		System.out.println(brand4.mobile + " " + brand4.Price);

		Constructor1 brand5 = new Constructor1("micromax", 7000);
		System.out.println(brand5.mobile + " " + brand5.Price);

		Constructor1 brand6 = new Constructor1("lava", 8000);
		System.out.println(brand6.mobile + " " + brand6.Price);

		Constructor1 brand7 = new Constructor1("nothing", 40000);
		System.out.println(brand7.mobile + " " + brand7.Price);

		Constructor1 brand8 = new Constructor1("realme", 26000);
		System.out.println(brand8.mobile + " " + brand8.Price);

		Constructor1 brand9 = new Constructor1("xiome", 25000);
		System.out.println(brand9.mobile + " " + brand9.Price);

		Constructor1 brand10 = new Constructor1("Google", 90000);
		System.out.println(brand10.mobile + " " + brand10.Price);

		System.out.println("hare all object call to constructor and print ");

	}

}
