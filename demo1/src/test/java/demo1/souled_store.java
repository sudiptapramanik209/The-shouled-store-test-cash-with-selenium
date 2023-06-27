package demo1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class souled_store {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://www.thesouledstore.com";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void I_am_check_button_is_vesible_or_cliclble_or_Not() {
		try {
			Boolean button=driver.findElement(By.xpath("//span[@class='nav-link noTdropdown']")).isDisplayed();
			Assert.assertTrue(button);
			System.out.println(button);
			driver.findElement(By.xpath("//span[@class='nav-link noTdropdown']")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void I_should_see_Login_page_with_title() {
		try {
			String str=driver.findElement(By.xpath("//div[contains(text(),'Login with The Souled Store')]")).getText();
			System.out.println(str);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=3)
	public void I_should_see_Register_page_with_title() {
		try {
			driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
			String str=driver.findElement(By.xpath("//div[contains(text(),'Register with The Souled Store')]")).getText();
			System.out.println(str);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=4)
	public void I_Click_the_Register_Button() {
		try {
			String str=driver.findElement(By.xpath("//div[contains(text(),'Register')]")).getText();
			System.out.println(str);
			driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=5)
	public void enter_my_firstname() {
		try {
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sudipta");
			Boolean input=driver.findElement(By.xpath("(//input[@type='text'])[1]")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=6)
	public void enter_my_lastname() {
		try {
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pramanik");
			Boolean input=driver.findElement(By.xpath("(//input[@type='text'])[2]")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=7)
	public void enter_Email() {
		try {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sudiptapramanik209@gmail.com");
			Boolean input=driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority=8)
	public void enter_New_password() {
		try {
			driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1234sudipta");
			Boolean input=driver.findElement(By.xpath("(//input[@type='password'])[1]")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 9)
	public void enter_conform_password() {
		try {
			driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1234sudipta");
			Boolean input=driver.findElement(By.xpath("(//input[@type='password'])[2]")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 10)
	public void enter_Mobile_number() {
		try {
			driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("8240756223");
			Boolean input=driver.findElement(By.xpath("//input[@type='mobile']")).isDisplayed();
			Assert.assertTrue(input);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 11)
	public void I_select_a_femal_and_then_male_gender() {
		try {
			String str=driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[@class='tss-body-wrapper']/div[@class='content greybg viewContainer']/div[@class='container']/div/div[@class='col-md-5']//form//label[@class='form-check-label']/label[2]/span[@class='custom-control-description']")).getText();
			System.out.println(str);
			driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[@class='tss-body-wrapper']/div[@class='content greybg viewContainer']/div[@class='container']/div/div[@class='col-md-5']//form//label[@class='form-check-label']/label[2]/span[@class='custom-control-description']")).click();
			String str1=driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[@class='tss-body-wrapper']/div[@class='content greybg viewContainer']/div[@class='container']/div/div[@class='col-md-5']//form//label[@class='form-check-label']/label[1]/span[@class='custom-control-description']")).getText();
			System.out.println(str1);
			driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[@class='tss-body-wrapper']/div[@class='content greybg viewContainer']/div[@class='container']/div/div[@class='col-md-5']//form//label[@class='form-check-label']/label[1]/span[@class='custom-control-description']")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 12)
	public void enter_Register_Button() {
		try {
			Boolean str=driver.findElement(By.xpath("//button[contains(text(),'Register')]")).isDisplayed();
			System.out.println(str);
			driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 13,enabled = true)
	public void enter_Login_link() {
		try {
			driver.findElement(By.xpath("//u[contains(text(),'Login')]")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	
	@Test(priority = 14,enabled = true)
	public void enter_valid_phone_number() {
		try {
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8240756223");
			Boolean str=driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
			System.out.println(str);
			driver.wait(1000);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
	@Test(priority = 15,enabled = true)
	public void click_login_button() {
		try {
			Boolean str=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
			System.out.println(str);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
}
