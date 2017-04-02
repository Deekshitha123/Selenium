package examplepack;

		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Radiobuttonexample 
		{

			public static void main(String[] args) throws InterruptedException 
			{
				
				
				WebDriver d=new FirefoxDriver();
				
				
				Thread.sleep(5000);		
				d.get("http://newtours.demoaut.com/");
				
				
				Thread.sleep(5000);
				d.findElement(By.name("userName")).sendKeys("deekshita");
				
				
				Thread.sleep(5000);
				d.findElement(By.name("password")).sendKeys("deeksha123");
				
				
				
				Thread.sleep(5000);
				d.findElement(By.name("login")).click();
				
				
				
				Thread.sleep(5000);
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
				String r1=d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).getAttribute("value");
				System.out.println(r1+" is handled");
				
				
				
				
				Thread.sleep(5000);
				d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
				String r2=d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).getAttribute("value");
				System.out.println(r2+" is handled");
			}

		

	}


