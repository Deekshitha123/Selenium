package sample;

public class Methodoverriding {

	public static void main(String[] args) {
		
		
		     
	        // BaseClass reference and object
	        BaseClass obj1 = new BaseClass(); 
	        // BaseClass reference but DerivedClass object
	        BaseClass obj2 = new DerivedClass(); 
	        // Calls the method from BaseClass class
	        obj1.methodToOverride(); 
	        //Calls the method from DerivedClass class
	        obj2.methodToOverride(); 
	     }

	public void methodToOverride() //Base class method
    {
         System.out.println ("I'm the method of BaseClass");
    }
	public class DerivedClass extends BaseClass
	{
	    public void methodToOverride() //Derived Class method
	    {
	         System.out.println ("I'm the method of DerivedClass");
	    }
	}

	

		

	}


