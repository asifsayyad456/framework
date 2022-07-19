package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class parameterizationCode {

	WebDriver driver=null;
	@Given("user is on login page") 
	public void user_is_on_login_page()
	{ 
		System.out.println("Inside: user is on login page");
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    driver.manage().window().maximize();
	    driver.get("https://example.testproject.io/web/");
		
	}
	
//  @When ("user enters <username> and <password>")
//	@When("user enters asif and {int}")	
	@When("^user enters ([^\"]*) and ([^\"]*)$") 
	public void user_enters_username_and_password(String username,String password)
	{ 
		System.out.println("Inside: user enters " + username + password);
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.id("login")).click();
	}
	
	@And("click on login page") 
	public void click_on_login_page() throws InterruptedException
	{ 
		System.out.println("Inside: click on login page");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}
	
	@Then("user is navigated to the home and enter ([^\"]*)$") 
	public void user_is_navigated_to_the_home() throws InterruptedException
	{ 
		/*
		String country;
	//	System.out.println("Inside: user is navigated to the home and enter country" + country );
		
		// select country india-google code for dropdown
//		Select dropdownCountry = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
//		dropdownCountry.selectByVisibleText("India");
		*/
//		Select dropdownCountry = new Select(driver.findElement(By.id("country")));
//		dropdownCountry.selectByVisibleText("Russia");
	Select drpcountry=new Select(driver.findElement(By.id("country")));
			drpcountry.selectByVisibleText("country");
			Thread.sleep(3000);
	//	driver.findElement(By.id("logout")).click();
	//	driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		driver.quit();
	}
}

