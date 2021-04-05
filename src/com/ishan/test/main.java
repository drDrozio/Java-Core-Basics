package com.ishan.test;

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		student s=new student();
		//Accessing public variable (same package)
		s.rollno=s.rollno+10;
		System.out.println(s.rollno);
		//Accessing default variable (same package)
		System.out.println(s.grade);
		
	}

}
