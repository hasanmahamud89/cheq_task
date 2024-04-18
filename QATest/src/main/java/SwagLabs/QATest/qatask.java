package SwagLabs.QATest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qatask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 
					// declaration and instantiation of objects/variables 
				   	System.setProperty("webdriver.chrome.driver", "C:\\AutomationConfig\\DRIVER\\chromedriver.exe");  
				    WebDriver driver=new ChromeDriver();  
				    // Launch web site 
				    driver.navigate().to("https://www.saucedemo.com/");  
				  
				    //Maximize current window
				    driver.manage().window().maximize(); 
				    
				    // Enter your login user id 
			        driver.findElement(By.id("user-name")) .sendKeys("standard_user"); 
			        
			        // Enter your login user password 
			        driver.findElement(By.id("password")) .sendKeys("secret_sauce"); 
			        
			        // Click on login  button
			        driver.findElement(By.id("login-button")).click();
			        
			        // Locate the drop down element 
			        WebElement dropdown1=driver.findElement(By.xpath("//select[@class='product_sort_container']")); 
			        Select selectObject1 = new Select(dropdown1);
			      
			        //select  the  maximum price
			        selectObject1.selectByValue("hilo");
			        
			        //  add maximum price product to the cart
			        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
			        
			       // print the  product name
			        WebElement element1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
			        String text1 = element1.getText();
			        System.out.println("Text on the webpage for max: " + text1);
			        
			        // print the description
			        WebElement element2 = driver.findElement(By.xpath("//div[@class='inventory_item_desc']"));
			        String text2 = element2.getText();
			        System.out.println("Text on the webpage for max: " + text2);
			  
			        //Continue shopping
			        driver.findElement(By.id("continue-shopping")).click();
			        
			        // Locate the drop down element 
			        WebElement dropdown2=driver.findElement(By.xpath("//select[@class='product_sort_container']")); 
			        Select selectObject2 = new Select(dropdown2);
			      
			        //select  the  minimum price
			        selectObject2.selectByValue("lohi");
			        // Adding a 2-second delay before navigating back
			        try {
			            Thread.sleep(2000);  // Pause execution for 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			        
			        //  add minimum price product to the cart
			        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
			        // Adding a 2-second delay before navigating back
			        try {
			            Thread.sleep(2000);  // Pause execution for 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			        // print the  product name
			        WebElement element3 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[last()]"));
			        String text3 = element3.getText();
			        System.out.println("Text on the webpag for min: " + text3);
			        
			        // print the description
			        WebElement element4 = driver.findElement(By.xpath("(//div[@class='inventory_item_desc'])[last()]"));
			        String text4 = element4.getText();
			        System.out.println("Text on the webpage for min: " + text4);
			        
			        //log out
			        
			        driver.findElement(By.id("react-burger-menu-btn")).click();
			        
			        try {
			            Thread.sleep(2000);  // Pause execution for 2 seconds
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			        
			        driver.findElement(By.id("logout_sidebar_link")).click();
			        
			        //Close the browser
			        
			       driver.quit(); 
	}
	
}
			        
			    
			        
			

