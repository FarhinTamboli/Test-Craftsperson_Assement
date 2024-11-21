package stpedefination;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefination {
	
	WebDriver driver;
	@Given("user on the create account page")
	public void user_on_the_create_account_page() 
	
	{
	    driver=new ChromeDriver();
	    driver.get("https://magento.softwaretestingboard.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
	    
	}

	
	@When("user enter valid details for new user {string}{string}{string}{string}{string}")
	public void user_enter_valid_details_for_new_user(String firstname, String Lastname, String Email, String Password, String ConfirmPassword)
	{
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(Lastname);
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(ConfirmPassword);
	   
	}

	@Then("user should redirect to homepage")
	public void use_should_redirect_to_homepage()
	{
	    driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	    boolean homepage=driver.findElement(By.xpath("//span[@class='base']")).isDisplayed();
	    Assert.assertTrue(homepage);
	    driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	    driver.close();
	    
	}
	
	@Given("user launches the application")
	public void user_launches_the_application() {
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String email, String password) {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
	    
	}

	@When("clicks the sign in button")
	public void clicks_the_sign_in_button() {
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		
	    
	}

	@Then("the user is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
		boolean homepage=driver.findElement(By.xpath("//span[@class='base']")).isDisplayed();
		 Assert.assertTrue(homepage);
		
	   
	}

	@Then("a welcome message is displayed")
	public void a_welcome_message_is_displayed() {
		WebElement str=driver.findElement(By.xpath("//div[@class='panel header']//li[@class='greet welcome']"));
		System.out.println(str);
		driver.close();
	    
	}


}
