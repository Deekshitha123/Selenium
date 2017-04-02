package examplepack;

import java.util.Scanner;

import com.google.gson.JsonArray;

public class User {

	

	private static Object root;

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter student name");
		String name= input.nextLine();
		System.out.println("enter age ");
		int age=input.nextInt();
		System.out.println("enter id");
		int id=input.nextInt();
		System.out.println("enter grade");
		String Grade=input.nextLine();
		
		//create JSON Object//
		
		JSONObject courseObject1= new JSONObject();
		courseObject1.put("name",course1);
		courseObject1.put("grade",course1);
		JsonArray courses = new JSONArray();
		courses.add(courseObject1);
		
		//add the array to the root object//
		
		root.put("courses",courses);
		system.out.println(root);
		
		
		


		
		
		


	}

}
