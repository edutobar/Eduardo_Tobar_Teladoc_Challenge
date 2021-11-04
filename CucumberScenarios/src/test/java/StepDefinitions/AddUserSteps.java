package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AddUserSteps {

	WebDriver driver= null;

	@SuppressWarnings("deprecation")
	@Given("user goes to link")
	public void user_goes_to_link() {

		System.out.println("Inside Step - user goes to link");

		System.setProperty("webdriver.chrome.driver", "C:/Users/EToba/eclipse-workspace/CucumberScenarios/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		

	}

	@And("user clicks on add user")
	public void user_clicks_on_add_user() throws InterruptedException {
		System.out.println("Inside Step - user clicks on add user");
		
		driver.navigate().to("https://www.way2automation.com/angularjs-protractor/webtables/");
		Thread.sleep(2000);
	}

	@When("user inputs required information")
	public void user_inputs_required_information() throws InterruptedException {
		System.out.println("Inside Step - user inputs required information");
		
		driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")).click();
				Thread.sleep(2000);

		/*driver.findElement(By.name("FirstName")).sendKeys("Eduardo");
		driver.findElement(By.name("LastName")).sendKeys("Tobar");
		driver.findElement(By.name("UserName")).sendKeys("EduT");
		driver.findElement(By.name("")).sendKeys("1234Pass");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]")).click();
		driver.findElement(By.name("Email")).sendKeys("eduardo@gmail.com");
		driver.findElement(By.name("Mobilephone")).sendKeys("7031112222");*/

	}

	@And("clicks saves")
	public void clicks_saves() throws InterruptedException {
		System.out.println("Inside Step - user clicks saves");
		
		driver.findElement(By.name("FirstName")).sendKeys("Eduardo");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("Tobar");
		Thread.sleep(2000);
		driver.findElement(By.name("UserName")).sendKeys("EduT");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("1234Pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("eduardo@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Mobilephone")).sendKeys("7031112222");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
		
	}

	@Then("new user is added to existing table")
	public void new_user_is_added_to_existing_table() {
		System.out.println("Inside Step - new user is added to existing table");
		
		driver.close();
	}

}
