package SpringExe.SpringThree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean("phone")
	public Phone createPhone() {
		Phone phone = new Phone();
		phone.setMobilename("Apple");
		phone.setMobileModel("16Pro");
		phone.setMobileEmieNum(1155334);
		return phone;
	}

	@Bean("price")
	public Price createPrice() {
		Price price = new Price();
		price.setMobilePrice(16000);
		price.setMobileShop("AppleStore");
		return price;
		
	}
	
}
