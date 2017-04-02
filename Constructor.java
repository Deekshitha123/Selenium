package sample;

public class Constructor {
	
	public static void main(String[] args) {
		Abc ob = new Abc();  //creating object//
		Abc ob1 = new Abc(2);  
		Abc ob2 = new Abc(2,4.9); 
	  
	
		//constructor
	}
}

	class Abc
		{
	public Abc()//constructor overloading//    //method//
			{
		
				System.out.println("int Abc const");
				
			}
		
		public Abc (int i)
				{
			System.out.println("int Abc const para");
				}
		public Abc(int i,double d)
				{
			System.out.println("int Abc const int double");
				
				}
		}
	
	


	


