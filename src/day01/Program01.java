package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program01 {

	public static void main(String[] args) {
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");

	 WebDriver driver;	
	 
	 driver = new ChromeDriver(option);
		
		  driver.get("https://demo.automationtesting.in/Register.html");
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(
		  "Test");
		  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(
		  "Java");
		  driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(
		  "Chennai");
		  
		  driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		  
		  driver.findElement(By.xpath("//input[@value='Male']")).click();
		 
	 
	 
	}

}