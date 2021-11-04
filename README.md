# Eduardo_Tobar_Teladoc_Challenge

Description: Use the existing repo for your automation challenge. (You should be able to set up a free account on github, bitbucket, sourceforge, etc. to share your coding challenge.)

Clone the repo and push up your changes and share link.

Using an automation framework of your choice. (Preferably leveraging Cucumber.)

Share a repository with your coding challenge
Name it with your "firstname_lastname_teladoc_challenge"
Update your README to show how to run your scripts.
Fulfill the following two scenarios:
Feature:
As an Engr. Candidate
I need to automate http://www.way2automation.com/angularjs-protractor/webtables/ 
So I can show my awesome automation skills

  - Scenario: Add a user and validate the user has been added to the table
  - Scenario: Delete user User Name: novak and validate user has been delete

Dependencies: 
1. IDE Eclipse
2. Framework Cucumber 
3. Selenium to automate Web Browser 
4. Java program language 

Executing the program:
For scenario Add user- Eduardo_Tobar_Teladoc_Challenge>CucumberScenarios>target>test-classes>Features>AddUser.feature
For AddUser.feature theres 1 scenario and 5 steps.
  Feature: feature to test adding user to the existing table

  Scenario: Validate user is added to the existing table
    Given user goes to link
    And user clicks on add user
    When user inputs required information
    And clicks saves
    Then new user is added to existing table
![AddUserPass](https://user-images.githubusercontent.com/93138962/140382110-0bedd00c-bbf0-4261-a9ba-ff3a9a745c42.png)

How to get to the stepdefinitions for adduser-
Eduardo_Tobar_Teladoc_Challenge>CucumberScenarios>src/test>java/StepDefinitions>AddUserSteps.java
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

For scenario delete user Novak- Eduardo_Tobar_Teladoc_Challenge>CucumberScenarios>target>test-classes>Features>DeleteUserNovak.feature
For DeleteUserNovak.feature theres 1 scenario and 4 steps.
Feature: feature to delete user novak

  Scenario: validate user novak is deleted
    Given user goes to table link
    And clicks the x on Novaks line
    When user clicks ok
    Then user novak will be deleted
    ![NovakDeletePass](https://user-images.githubusercontent.com/93138962/140382960-0e622938-e02f-491e-b064-fda2e09134ea.png)
    
  How to get to the stepdefinitions for DeleteUserNovakSteps.java-
Eduardo_Tobar_Teladoc_Challenge>CucumberScenarios>src/test>java/StepDefinitions>DeleteUserNovakSteps.java
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

    
