package examplepack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webdriverex {

	public static void main(String[] args) {
		
			{

				new FirefoxDriver();
				System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
				
				new ChromeDriver();
				
				
				System.setProperty("webdriver.ie.driver", "D:\\Softwares\\IEDriverServer.exe");
				new InternetExplorerDriver();
				
			}
	}
				

}


