package step_defination;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defination {

		WebDriver d;
		@Given("when user open the browser & enter the url")
		public void enter_baseurl()
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			d=new FirefoxDriver();
			d.get("https://www.facebook.com");
		}
		
		@Then("login page should be displayed")
		public void lgn_page()
		{
			String t=d.getTitle();
			Assert.assertEquals(t, "Facebook – log in or sign up");		
		}
		
		@When("valid cred are entered")
		public void cred()
		{
			d.findElement(By.id("email")).sendKeys("karti");;
			d.findElement(By.id("pass")).sendKeys("karti");
		}
		
		@When("click on login button")
		public void lgn_btn() throws InterruptedException
		{
			d.findElement(By.id("u_0_5_+T")).click();
			Thread.sleep(2000);
		}
		
		@Then("home page should be displayed")
		public void home_page()
		{
			String t=d.getTitle();
			Assert.assertEquals(t, "Facebook Home Page");
		}
	}

