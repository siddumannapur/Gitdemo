package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	static WebDriver driver=null;
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smannapur\\Documents\\Java-selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	   
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    
	}

	@Then("user is navigated to the environment page")
	public void user_is_navigated_to_the_environment_page() {
	    System.out.println("logged in successfully");
	}
	
	

@Given("user adds bag to cart")
public void user_adds_bag_to_cart() {
    driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
}

@When("user goes to cart")
public void user_goes_to_cart() {
    driver.findElement(By.id("shopping_cart_container")).click();
}

@Then("Clicks check out")
public void clicks_check_out() {
	driver.findElement(By.id("checkout")).click();
}

@Then("enter all the details")
public void enter_all_the_details() {
    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Siddu");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("M");
    driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("560067");
}

@Then("order the item")
public void order_the_item() {
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
}


@After
public void teardown() {

    driver.quit();
}




	

}
