package examplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {



	{

		
		WebDriver f=new FirefoxDriver();
		
		
		
		
		f.get("http://www.facebook.com");
		
		f.findElement(By.name("userName")).sendKeys("deeksha_63@yahoo.in");
		
		
		
		f.findElement(By.name("password")).sendKeys("deeksha123");
		
		
		
		
		f.findElement(By.name("login")).click();
		

	}

}
}