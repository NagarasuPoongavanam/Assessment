package com.gmail.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Compose_Email_steps  {
 
	public static WebDriver driver;

	@Given("User is on gmail login page")
	public void user_is_on_gmail_login_page() {
		//Initialize the webDriver
		driver=new ChromeDriver();		
		//Load the URl		
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
	}
	
	@When("User Enters User Name and password")
	public void user_enters_user_name_and_password() {
		   
		//FInding the locater for email ID test box  and pass the maill ID & Enter	
    	WebElement emailId = driver.findElement(By.id("identifierId"));
    	emailId.sendKeys("nagarasu0906@gmail.com",Keys.ENTER);
    	//FInding the locater for email ID test box  and pass the maill ID & Enter  	
    	driver.findElement(By.name("Passwd")).sendKeys("baskar522@",Keys.ENTER);	
	}
	
	@When("User writes an email with {string}  and {string}")
	public void user_writes_an_email_with_and(String string, String string2) {
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To mail
		driver.findElement(By.id(":uz")).sendKeys("senthil123@gmail.com");;
		//Subject of the mail
		driver.findElement(By.id(":rd")).sendKeys(string);;
		//Body of the mail
		driver.findElement(By.id(":sm")).sendKeys(string2);;
		//Click the send button
		driver.findElement(By.id(":r2")).click();	
	}
	
	@Then("User verifies that email sent success message")
	public void user_verifies_that_email_sent_success_message() {
	    System.out.println("Mail send successfully");
		   
	}




}

