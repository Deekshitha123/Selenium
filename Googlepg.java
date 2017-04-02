package examplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Googlepg {

	public static void main1(String[] args) throws InterruptedException {
		
		
 	
				WebDriver d=new FirefoxDriver();
				
				
				
				Thread.sleep(5000);		
				d.get("https://www.google.com");
				
				
				
				Thread.sleep(5000);
				d.findElement(By.linkText("Sign in")).click();
				
				
				
				Thread.sleep(5000);
				d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("deekshitha.qa@gmail.com");
				
				
				
				Thread.sleep(5000);
				d.findElement(By.xpath(".//*[@id='next']")).click();
				
			
				Thread.sleep(5000);
				d.findElement(By.name(".//*[@id='password']")).sendKeys("Deekshitha7");
				
				
				Thread.sleep(5000);
				d.findElement(By.id(".//*[@id='submit']")).click();
				
				
				
				
				

	}

}
