package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class DeleteUserNovakSteps {
	
	WebDriver driver= null;

	@Given("user goes to table link")
	public void user_goes_to_table_link() throws InterruptedException {
		System.out.println("Inside Step - user goes to table link");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/EToba/eclipse-workspace/CucumberScenarios/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.way2automation.com/angularjs-protractor/webtables/");
		Thread.sleep(2000);
	}

	@And("clicks the x on Novaks line")
	public void clicks_the_x_on_novaks_line() throws InterruptedException {
		System.out.println("Inside Step - clicks the x on Novaks line");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[11]/button/i")).click();
		Thread.sleep(2000);
	}

	@When("user clicks ok")
	public void user_clicks_ok() throws InterruptedException {
		System.out.println("Inside Step - user clicks ok");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
		Thread.sleep(2000);
	}

	@Then("user novak will be deleted")
	public void user_novak_will_be_deleted() {
		System.out.println("Inside Step - user novak will be deleted");
		
		driver.close();
		
	
	}

}
