package examplepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Website {

	public static void main(String[] args) throws InterruptedException {



		WebDriver f=new FirefoxDriver();
		
		Thread.sleep(5000);
		f.get("http://www.youtube.com");
		
		
		Thread.sleep(5000);
		f.navigate().to("http://www.gmail.com");
		
		Thread.sleep(5000);
		f.navigate().to("enter user name");
		
		Thread.sleep(5000);
		f.navigate().to("deekshithataduri@gmail.com");
		Thread.sleep(5000);
		f.navigate().back();
		
		Thread.sleep(5000);
		f.navigate().forward();
		

	}

}


