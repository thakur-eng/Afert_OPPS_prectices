package SpringExe.SpringThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Spring Hello World!");
         
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        

        Phone phone = (Phone) context.getBean("phone");
        phone.didplyMobiledetils();
        
        Price price = (Price) context.getBean("price");
        price.displayPrice();
    }
}
