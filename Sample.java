package frame;

import org.testng.annotations.Test;

public class Sample {
	@Test(priority=1)
	
	public void Login()
	{
	System.out.println("Login Sucessfully....");
	}
	@Test(priority=2)
	public void Deposit()
	{
	System.out.println("Deposit Sucessfully....");
	}
	@Test(priority=3)
	public void Transaction()
	{
	System.out.println("Transaction completed ");
	}
	
	@Test(priority=4)
	public void Logout()
	{
	System.out.println("Logout Sucessfully....");
	}

	}


