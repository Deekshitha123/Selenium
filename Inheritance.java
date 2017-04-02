package sample;

public class Inheritance {

	public static void main(String[] args) {
		
	     B obj = new B();
	     obj.methodA(); //calling super class method
	     obj.methodB(); //calling local method
	  }
}
	   class Ab
	   {
		   public void methodA()
		   {
		     System.out.println("base class");
		   }
		}

   class B extends Ab
		{  
		   public void methodB()
		   {
		     System.out.println("Child class method");
		   }
		
		


		}


