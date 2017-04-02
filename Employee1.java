package details;


public class Employee1 {

	private int eno;
	private String ename;
	private double salary;
	void empdetails()
	{
		System.out.println("employeee details");
	}
	Employee1(int eno, String ename,double salary)//constructor with parameters
	{
		this.eno=eno;
		this.ename=ename;
		this.salary=salary;
		
	}
public String empret()
{
	return "ename "  +ename+ "eno "+ eno + "salary" +salary;
	
}
public String empret(String sname)//method with parameter and with return
{
	
	return sname;
	
}
public void empnoret(int emp_no)
{
	System.out.println(emp_no);
}

public String toString()

{
	return ename+" "+eno+" "+Double.toString(salary);
}
	public static void main(String[] args) {
		//declare  class objects
		
	      Employee1 e1=new Employee1(3214,  "siva",  456.21);
		  Employee1 e2=new Employee1(2134,  "mona"    ,3456.21);
			e1.empdetails();
			System.out.println("the employee name is "+e1.empret("Deekshitha"));
			e1.empnoret(10);
	System.out.println(e1);		
	System.out.println(e2);
	}
}
			
		