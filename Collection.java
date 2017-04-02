package examplepack;

import java.util.ArrayList;
import java.util.Iterator;


public class Collection {

	
	
		 public static void main(String args[])
		 {  
			   
			  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
			  
			  al.add("Ram");//adding object in arraylist  
			  al.add("jhon");  
			  al.add("chris");  
			  al.add("ravi");  
			  
			  Iterator<String> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
			  while(itr.hasNext())
			  {  
			   System.out.println(itr.next());  
			  }  
			  
			  
			 
			  for(String b:al)
			  {
				  System.out.println(b);  
			  }
		 }

	











	}


